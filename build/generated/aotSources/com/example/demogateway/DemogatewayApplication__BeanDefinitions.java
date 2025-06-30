package com.example.demogateway;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link DemogatewayApplication}.
 */
@Generated
public class DemogatewayApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'demogatewayApplication'.
   */
  public static BeanDefinition getDemogatewayApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DemogatewayApplication.class);
    beanDefinition.setTargetType(DemogatewayApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(DemogatewayApplication.class);
    beanDefinition.setInstanceSupplier(DemogatewayApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
