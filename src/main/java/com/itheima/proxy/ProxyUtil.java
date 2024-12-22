package com.itheima.proxy;

import com.itheima.model.BigStar;
import com.itheima.model.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    public static Star createProxy(BigStar bigStar) {

        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        if(method.getName().equals("sing")) {
                            System.out.println(method.getName()+"场地已经准备就绪");
                        } else if (method.getName().equals("dance")) {
                            System.out.println(method.getName()+"场地已经准备就绪");
                        }

                        return method.invoke(bigStar, args);
                    }
                });
        return starProxy;
    }
}
