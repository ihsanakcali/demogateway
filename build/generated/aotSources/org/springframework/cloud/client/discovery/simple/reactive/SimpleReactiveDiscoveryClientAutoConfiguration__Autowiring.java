package org.springframework.cloud.client.discovery.simple.reactive;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SimpleReactiveDiscoveryClientAutoConfiguration}.
 */
@Generated
public class SimpleReactiveDiscoveryClientAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SimpleReactiveDiscoveryClientAutoConfiguration apply(RegisteredBean registeredBean,
      SimpleReactiveDiscoveryClientAutoConfiguration instance) {
    AutowiredFieldValueResolver.forField("server").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("serviceId").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("inet").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
