package org.springframework.cloud.client.discovery.composite.reactive;

import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReactiveCompositeDiscoveryClientAutoConfiguration}.
 */
@Generated
public class ReactiveCompositeDiscoveryClientAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'reactiveCompositeDiscoveryClientAutoConfiguration'.
   */
  public static BeanDefinition getReactiveCompositeDiscoveryClientAutoConfigurationBeanDefinition(
      ) {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReactiveCompositeDiscoveryClientAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ReactiveCompositeDiscoveryClientAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'reactiveCompositeDiscoveryClient'.
   */
  private static BeanInstanceSupplier<ReactiveCompositeDiscoveryClient> getReactiveCompositeDiscoveryClientInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ReactiveCompositeDiscoveryClient>forFactoryMethod(ReactiveCompositeDiscoveryClientAutoConfiguration.class, "reactiveCompositeDiscoveryClient", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ReactiveCompositeDiscoveryClientAutoConfiguration.class).reactiveCompositeDiscoveryClient(args.get(0)));
  }

  /**
   * Get the bean definition for 'reactiveCompositeDiscoveryClient'.
   */
  public static BeanDefinition getReactiveCompositeDiscoveryClientBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReactiveCompositeDiscoveryClient.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setInstanceSupplier(getReactiveCompositeDiscoveryClientInstanceSupplier());
    return beanDefinition;
  }
}
