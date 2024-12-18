package com.itheima.mapper;

import com.itheima.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ManagerMapper {
    List<Manager> findAll();
}
