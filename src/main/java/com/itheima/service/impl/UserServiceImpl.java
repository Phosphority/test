package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.entity.Manager;
import com.itheima.mapper.ManagerMapper;
import com.itheima.service.UserService;
import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
@Service("userService")
@Lazy(false)
@Alias("aaa,bbb,ccc")
@Scope("singleton")
//@Scope("prototype")
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Qualifier("managerMapper")
    private ManagerMapper managerMapper;
    public void setManagerMapper(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }

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
    @PostConstruct
    public void init(){
        System.out.println("正在初始化....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("正在销毁....");
    }

    @Autowired
    public List<UserDao> userDaoList;

    @Value("EEEE")
    public List<String> stringList;

    @Autowired
    @Qualifier("userDao")
    public Set<UserDao> UserDaoSet;

    @Value("WWW,EEE,RRR")
    public Set<String> stringSet;

//    public Map<Integer, UserDao> UserDaoMap;
//
//    public Properties properties;
//
    public void show(){

        System.out.println(userDaoList);
        System.out.println(stringList);
        System.out.println(UserDaoSet);
        System.out.println(stringSet);
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
