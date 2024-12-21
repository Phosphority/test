package com.itheima.beans;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Component
public class Others {

    @Bean("dataSource")
    @Autowired
    public DataSource setDataSource(
            @Value("${jdbc.driver}") String driver,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.username}") String username,
            @Value("${jdbc.password}") String password,
            @Qualifier("userDao") UserDao userDao
    ) {

        System.out.println(url);
        System.out.println(userDao);

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
