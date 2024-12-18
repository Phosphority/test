package com.itheima.test;

public class BeanFactoryTest {
    public static void main(String[] args) {
        //创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //创建一个读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //将读取到的Xml文件通过loadBeanDefinitions()方法给beanFactory
        reader.loadBeanDefinitions("beans.xml");
        //最后通过ID将，在beans.xml中配置好的bean使用
        UserService userService =  (UserService) beanFactory.getBean("userService");
        System.out.println(userService);
        UserServiceImpl userServiceImpl = (UserServiceImpl) beanFactory.getBean("userService");
        System.out.println(userServiceImpl);

        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
        System.out.println(userDao);
    }
}
