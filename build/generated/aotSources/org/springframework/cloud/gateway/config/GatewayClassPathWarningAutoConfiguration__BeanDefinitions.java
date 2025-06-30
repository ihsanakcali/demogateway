package org.springframework.cloud.gateway.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GatewayClassPathWarningAutoConfiguration}.
 */
@Generated
public class GatewayClassPathWarningAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'gatewayClassPathWarningAutoConfiguration'.
   */
  public static BeanDefinition getGatewayClassPathWarningAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GatewayClassPathWarningAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(GatewayClassPathWarningAutoConfiguration::new);
    return beanDefinition;
  }
}
