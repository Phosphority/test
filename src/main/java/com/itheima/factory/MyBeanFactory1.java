package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

public class MyBeanFactory1 {

    public static UserDao userDao(){
        System.out.println("这是在配置bean1所进行的操作");
        return new UserDaoImpl();
    }

}
