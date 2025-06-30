package com.example.demogateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import java.util.UUID;


@Component
public class RequestResponseLoggingFilter implements GlobalFilter, Ordered {

    private static final Logger log = LoggerFactory.getLogger(RequestResponseLoggingFilter.class);

    private static final String HEADER_CORRELATION_ID = "x-rly-corr";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
        ServerHttpRequest originalRequest = exchange.getRequest();
        String existingCorrId = originalRequest.getHeaders().getFirst(HEADER_CORRELATION_ID);

        String correlationId = existingCorrId != null ? existingCorrId : UUID.randomUUID().toString();
        exchange.getAttributes().put("requestId", correlationId);  // Used for logging and response header

        // Inject header only if it wasn't already there
        ServerHttpRequest mutatedRequest = originalRequest.mutate()
                .headers(httpHeaders -> {
                    if (existingCorrId == null) {
                        httpHeaders.add(HEADER_CORRELATION_ID, correlationId);
                    }
                })
                .build();

        long startTime = System.currentTimeMillis();

        return chain.filter(exchange.mutate().request(mutatedRequest).build())
                .then(Mono.fromRunnable(() -> {
                    long duration = System.currentTimeMillis() - startTime;
                    ServerHttpResponse response = exchange.getResponse();

                    if (!response.isCommitted()) {
                        response.getHeaders().add("X-Request-ID", correlationId);
                        response.getHeaders().add("X-Response-Time", String.valueOf(duration));
                    }

                    log.info("Correlation ID: {}, Method: {}, Path: {}, Status: {}, Duration: {}ms",
                            correlationId,
                            originalRequest.getMethod(),
                            originalRequest.getURI().getPath(),
                            response.getStatusCode(),
                            duration
                    );
                }));
    }

    @Override
    public int getOrder() {
        return -1;
    }
}