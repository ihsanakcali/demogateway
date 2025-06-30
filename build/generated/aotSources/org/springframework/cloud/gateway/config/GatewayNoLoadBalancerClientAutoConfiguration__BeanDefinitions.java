package org.springframework.cloud.gateway.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GatewayNoLoadBalancerClientAutoConfiguration}.
 */
@Generated
public class GatewayNoLoadBalancerClientAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'gatewayNoLoadBalancerClientAutoConfiguration'.
   */
  public static BeanDefinition getGatewayNoLoadBalancerClientAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GatewayNoLoadBalancerClientAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(GatewayNoLoadBalancerClientAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'noLoadBalancerClientFilter'.
   */
  private static BeanInstanceSupplier<GatewayNoLoadBalancerClientAutoConfiguration.NoLoadBalancerClientFilter> getNoLoadBalancerClientFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<GatewayNoLoadBalancerClientAutoConfiguration.NoLoadBalancerClientFilter>forFactoryMethod(GatewayNoLoadBalancerClientAutoConfiguration.class, "noLoadBalancerClientFilter", GatewayLoadBalancerProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(GatewayNoLoadBalancerClientAutoConfiguration.class).noLoadBalancerClientFilter(args.get(0)));
  }

  /**
   * Get the bean definition for 'noLoadBalancerClientFilter'.
   */
  public static BeanDefinition getNoLoadBalancerClientFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GatewayNoLoadBalancerClientAutoConfiguration.NoLoadBalancerClientFilter.class);
    beanDefinition.setInstanceSupplier(getNoLoadBalancerClientFilterInstanceSupplier());
    return beanDefinition;
  }
}
