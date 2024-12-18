package com.itheima.service.impl;

import com.itheima.dao.UserDao;

public class Test {

    public UserDao userDao;
    public void setUserDao(UserDao userDao) {
        System.out.println("这是一个小小的测试");
        this.userDao = userDao;
    }

    public void sayHello() {
        System.out.println("hello");
    }
}
