package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.entity.Catalog;
import com.itheima.entity.Manager;
import com.itheima.service.CatalogService;
import com.itheima.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        //指定运行环境
//        System.setProperty("spring.profiles.active", "test01");

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         UserService userService = applicationContext.getBean("userService", UserService.class);
         userService.show();

        UserDao userDao  = applicationContext.getBean("userDao", UserDaoImpl.class);
        System.out.println(userDao);

        Manager manager = applicationContext.getBean("manager", Manager.class);
        System.out.println(manager);

        Catalog catalog = applicationContext.getBean("catalog", Catalog.class);
        System.out.println(catalog);

        CatalogService catalogService = applicationContext.getBean("catalogService", CatalogService.class);
        System.out.println(catalogService);
        System.out.println(catalogService);
//        applicationContext.close();
//        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
//        System.out.println(dataSource);
//        Connection connection = (Connection) applicationContext.getBean("connection");
//        System.out.println(connection);
//        Date date = applicationContext.getBean("date",Date.class);
//        System.out.println(date);
//        SqlSessionFactory sqlSessionFactory = applicationContext.getBean("sqlSessionFactory", SqlSessionFactory.class);
//        System.out.println(sqlSessionFactory);
//        applicationContext.close();
    }
}