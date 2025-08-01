package org.springframework.boot.autoconfigure.web.reactive;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.http.server.reactive.HttpHandler;

/**
 * Bean definitions for {@link HttpHandlerAutoConfiguration}.
 */
@Generated
public class HttpHandlerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'httpHandlerAutoConfiguration'.
   */
  public static BeanDefinition getHttpHandlerAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpHandlerAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(HttpHandlerAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link HttpHandlerAutoConfiguration.AnnotationConfig}.
   */
  @Generated
  public static class AnnotationConfig {
    /**
     * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration$AnnotationConfig'.
     */
    private static BeanInstanceSupplier<HttpHandlerAutoConfiguration.AnnotationConfig> getAnnotationConfigInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<HttpHandlerAutoConfiguration.AnnotationConfig>forConstructor(ApplicationContext.class)
              .withGenerator((registeredBean, args) -> new HttpHandlerAutoConfiguration.AnnotationConfig(args.get(0)));
    }

    /**
     * Get the bean definition for 'annotationConfig'.
     */
    public static BeanDefinition getAnnotationConfigBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpHandlerAutoConfiguration.AnnotationConfig.class);
      beanDefinition.setInstanceSupplier(getAnnotationConfigInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'httpHandler'.
     */
    private static BeanInstanceSupplier<HttpHandler> getHttpHandlerInstanceSupplier() {
      return BeanInstanceSupplier.<HttpHandler>forFactoryMethod(HttpHandlerAutoConfiguration.AnnotationConfig.class, "httpHandler", ObjectProvider.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HttpHandlerAutoConfiguration.AnnotationConfig.class).httpHandler(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'httpHandler'.
     */
    public static BeanDefinition getHttpHandlerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpHandler.class);
      beanDefinition.setInstanceSupplier(getHttpHandlerInstanceSupplier());
      return beanDefinition;
    }
  }
}
