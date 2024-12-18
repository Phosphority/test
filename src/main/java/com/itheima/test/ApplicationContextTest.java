package com.itheima.test;

import com.itheima.dao.PersonDao;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.PersonDaoImpl;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Date;
import java.util.function.Consumer;

public class ApplicationContextTest {
    public static void main(String[] args) {
        //指定运行环境
//        System.setProperty("spring.profiles.active", "test01");

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userServiceImpl =  applicationContext.getBean(UserServiceImpl.class);
//        System.out.println(userService);
        PersonDaoImpl personDao = (PersonDaoImpl)applicationContext.getBean("personDao");
        System.out.println(personDao);
//        UserDao userDao = (UserDaoImpl) applicationContext.getBean("myFactoryBean1");
//        System.out.println(userDao);
//        UserDao userDao = applicationContext.getBean("userDao",UserDaoImpl.class);
//        System.out.println(userDao);
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