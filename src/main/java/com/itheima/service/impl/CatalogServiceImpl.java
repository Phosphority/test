package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.PersonDaoImpl;
import com.itheima.entity.Catalog;
import com.itheima.entity.Manager;
import com.itheima.service.CatalogService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("catalogService")
@Scope("singleton")
@Lazy(false)
@Data
public class CatalogServiceImpl implements CatalogService {

//    @Value("userDao")
//    UserDao userDao;

    @Autowired
    Catalog catalog;

    @Autowired
    @Qualifier("manager")
    Manager manager;

    @Resource(name="personDao")
    PersonDaoImpl personDao;

    public Catalog getCatalog() {
        return catalog;
    }

    public Manager getManager() {
        return manager;
    }

    public PersonDaoImpl getPersonDao() {
        return personDao;
    }

//    public UserDao getUserDao() {
//        return userDao;
//    }
}
