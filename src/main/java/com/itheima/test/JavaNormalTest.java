package com.itheima.test;


import com.itheima.model.BigStar;
import com.itheima.model.Star;
import com.itheima.proxy.ProxyUtil;
import org.junit.jupiter.api.Test;

public class JavaNormalTest {

    @Test
    public void javaTest(){
        BigStar star = new BigStar("蔡徐坤");

        Star proxyStar = ProxyUtil.createProxy(star);

        String rs = proxyStar.sing();
        System.out.println(rs);

        proxyStar.dance();
    }
}
