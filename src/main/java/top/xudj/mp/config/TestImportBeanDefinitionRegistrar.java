package top.xudj.mp.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 如果类不能被spring扫描到或被其它bean引用到，即使实现涉及spring的生命周期的接口，也不会被spring创建
 * （ImportBeanDefinitionRegistrar需要结合@Import使用）
 *
 * 包括且不限于 InitializingBean, ApplicationContextAware, BeanNameAware, BeanDefinitionRegistryPostProcessor
 */
public class TestImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar, BeanFactoryAware {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println("TestImportBeanDefinitionRegistrar#registerBeanDefinitions 111");
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        System.out.println("TestImportBeanDefinitionRegistrar#registerBeanDefinitions 222");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("TestImportBeanDefinitionRegistrar#setBeanFactory 1111");
    }

}
