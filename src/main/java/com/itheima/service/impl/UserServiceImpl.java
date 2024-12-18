package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.entity.Manager;
import com.itheima.mapper.ManagerMapper;
import com.itheima.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class UserServiceImpl implements UserService {

    private ManagerMapper managerMapper;

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

    public List<String> stringList;

    public Set<UserDao> UserDaoSet;

    public Set<String> stringSet;

    public Map<Integer, UserDao> UserDaoMap;

    public Properties properties;
//
    public void show(){

//        System.out.println(userDaoList);
//        System.out.println(stringList);
//        System.out.println(UserDaoSet);
//        System.out.println(stringSet);
//        System.out.println(UserDaoMap);
//        System.out.println(properties);
        List<Manager> managers = managerMapper.findAll();
        for(Manager manager:managers){
            System.out.println(manager);
        }
    }
//
//    public UserDao userDao;
//    public void setUserDao(UserDao userDao) {
//        System.out.println("属性设置完毕");
//        this.userDao = userDao;
//    }
//
//
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("这是一个afterPropertiesSet方法,表示在属性设置完成之后执行的方法");
//    }
}
