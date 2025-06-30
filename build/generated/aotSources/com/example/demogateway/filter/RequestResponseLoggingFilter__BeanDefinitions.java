package com.example.demogateway.filter;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RequestResponseLoggingFilter}.
 */
@Generated
public class RequestResponseLoggingFilter__BeanDefinitions {
  /**
   * Get the bean definition for 'requestResponseLoggingFilter'.
   */
  public static BeanDefinition getRequestResponseLoggingFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RequestResponseLoggingFilter.class);
    beanDefinition.setInstanceSupplier(RequestResponseLoggingFilter::new);
    return beanDefinition;
  }
}
