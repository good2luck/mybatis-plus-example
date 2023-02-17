package top.xudj.mp.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(proxyBeanMethods = false)
@Import({TestImportBeanDefinitionRegistrar.class})
@ConditionalOnMissingBean({TestImportBeanDefinitionRegistrar.class})
public class TestConditionalOnMissingBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TestConditionalOnMissingBean#afterPropertiesSet");
    }

}
