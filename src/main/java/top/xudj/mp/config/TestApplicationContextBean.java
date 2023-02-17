package top.xudj.mp.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class TestApplicationContextBean implements ApplicationContextAware, InitializingBean {

    public static ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
//            System.out.println(">>>>>>" + name);
        }
        System.out.println("TestApplicationContextBean ------Bean 总计:" + applicationContext.getBeanDefinitionCount());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("TestApplicationContextBean#setApplicationContext");
        TestApplicationContextBean.applicationContext = applicationContext;
    }
}
