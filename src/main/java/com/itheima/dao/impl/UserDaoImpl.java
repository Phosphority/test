package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository("userDao")
@Primary //可以提高优先级，如果类型相同的情况下，会被优先注入
//@Profile("test") //该注解表示它从属于test这个环境，相当于Xml中的<space>标签
public class UserDaoImpl implements UserDao {

}
