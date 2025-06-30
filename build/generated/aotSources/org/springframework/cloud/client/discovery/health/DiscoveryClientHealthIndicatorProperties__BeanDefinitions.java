package org.springframework.cloud.client.discovery.health;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DiscoveryClientHealthIndicatorProperties}.
 */
@Generated
public class DiscoveryClientHealthIndicatorProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'discoveryClientHealthIndicatorProperties'.
   */
  public static BeanDefinition getDiscoveryClientHealthIndicatorPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DiscoveryClientHealthIndicatorProperties.class);
    beanDefinition.setInstanceSupplier(DiscoveryClientHealthIndicatorProperties::new);
    return beanDefinition;
  }
}
