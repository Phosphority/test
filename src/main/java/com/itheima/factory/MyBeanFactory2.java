package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.stereotype.Component;

@Component("beanFactory2")
public class MyBeanFactory2 {

    public UserDao userDao(){
        System.out.println("这是在配置bean2所进行的操作");
        return new UserDaoImpl();
    }
}
