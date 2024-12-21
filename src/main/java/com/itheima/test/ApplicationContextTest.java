package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.entity.Catalog;
import com.itheima.entity.Manager;
import com.itheima.service.CatalogService;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class ApplicationContextTest {
    public static void main(String[] args) {
        //指定运行环境
//        System.setProperty("spring.profiles.active", "test01");
//      ClassPathXmlApplicationContext是基于xml的spring的配置开发
//      ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//      AnnotationConfigApplicationContext是基于注解的spring的配置开发
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);

        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);
        userService.show();
    }
}