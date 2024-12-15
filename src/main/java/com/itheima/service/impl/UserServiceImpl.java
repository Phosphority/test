package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.InitializingBean;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserServiceImpl implements UserService, InitializingBean {

//    public UserServiceImpl() {
//        System.out.println("这是一个无参构造方法");
//    }

//    public UserServiceImpl(String name) {
//        System.out.println("这是一个有参构造方法"+name);
//    }
//
//    public UserServiceImpl(String name,String password) {
//        System.out.println("这是一个有参构造方法"+name+password);
//    }
//
//    public void init(){
//        System.out.println("正在初始化....");
//    }
//
//    public void destroy(){
//        System.out.println("正在销毁....");
//    }

    public List<UserDao> userDaoList;
    public void setUserDaoList(List<UserDao> userDaoList) {
        this.userDaoList = userDaoList;
    }

    public List<String> stringList;
    public void setStringList(List<String> list) {
        this.stringList = list;
    }

    public Set<UserDao> UserDaoSet;
    public void setUserDaoSet(Set<UserDao> userDaoSet) {
        UserDaoSet = userDaoSet;
    }

    public Set<String> stringSet;
    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<Integer, UserDao> UserDaoMap;
    public void setUserDaoMap(Map<Integer, UserDao> userDaoMap) {
        this.UserDaoMap = userDaoMap;
    }

    public Properties properties;
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void show(){
        System.out.println(userDaoList);
        System.out.println(stringList);
        System.out.println(UserDaoSet);
        System.out.println(stringSet);
        System.out.println(UserDaoMap);
        System.out.println(properties);
    }

    public UserDao userDao;
    public void setUserDao(UserDao userDao) {
        System.out.println("属性设置完毕");
        this.userDao = userDao;
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("这是一个afterPropertiesSet方法,表示在属性设置完成之后执行的方法");
    }
}
