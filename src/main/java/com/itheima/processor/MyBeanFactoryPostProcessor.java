package com.itheima.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        System.out.println("在beanDefinitionMap填充完毕之后回调该方法");
//            BeanDefinition beanDefinition = new RootBeanDefinition();
//            beanDefinition.setBeanClassName("com.itheima.dao.impl.PersonDaoImpl");
//            DefaultListableBeanFactory beanFactory1 = (DefaultListableBeanFactory) beanFactory;
//            beanFactory1.registerBeanDefinition("personDao",beanDefinition);
//        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
//        System.out.println(beanDefinition);
    }
}