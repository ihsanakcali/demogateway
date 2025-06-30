package org.springframework.cloud.gateway.discovery;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GatewayDiscoveryClientAutoConfiguration}.
 */
@Generated
public class GatewayDiscoveryClientAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'gatewayDiscoveryClientAutoConfiguration'.
   */
  public static BeanDefinition getGatewayDiscoveryClientAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GatewayDiscoveryClientAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(GatewayDiscoveryClientAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'discoveryLocatorProperties'.
   */
  private static BeanInstanceSupplier<DiscoveryLocatorProperties> getDiscoveryLocatorPropertiesInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DiscoveryLocatorProperties>forFactoryMethod(GatewayDiscoveryClientAutoConfiguration.class, "discoveryLocatorProperties")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(GatewayDiscoveryClientAutoConfiguration.class).discoveryLocatorProperties());
  }

  /**
   * Get the bean definition for 'discoveryLocatorProperties'.
   */
  public static BeanDefinition getDiscoveryLocatorPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DiscoveryLocatorProperties.class);
    beanDefinition.setInstanceSupplier(getDiscoveryLocatorPropertiesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link GatewayDiscoveryClientAutoConfiguration.ReactiveDiscoveryClientRouteDefinitionLocatorConfiguration}.
   */
  @Generated
  public static class ReactiveDiscoveryClientRouteDefinitionLocatorConfiguration {
    /**
     * Get the bean definition for 'reactiveDiscoveryClientRouteDefinitionLocatorConfiguration'.
     */
    public static BeanDefinition getReactiveDiscoveryClientRouteDefinitionLocatorConfigurationBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(GatewayDiscoveryClientAutoConfiguration.ReactiveDiscoveryClientRouteDefinitionLocatorConfiguration.class);
      beanDefinition.setInstanceSupplier(GatewayDiscoveryClientAutoConfiguration.ReactiveDiscoveryClientRouteDefinitionLocatorConfiguration::new);
      return beanDefinition;
    }
  }
}
