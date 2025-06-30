package org.springframework.cloud.gateway.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GatewayLoadBalancerProperties}.
 */
@Generated
public class GatewayLoadBalancerProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'gatewayLoadBalancerProperties'.
   */
  public static BeanDefinition getGatewayLoadBalancerPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GatewayLoadBalancerProperties.class);
    beanDefinition.setInstanceSupplier(GatewayLoadBalancerProperties::new);
    return beanDefinition;
  }
}
