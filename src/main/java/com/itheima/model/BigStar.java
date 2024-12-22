package com.itheima.model;

public class BigStar implements Star{

    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    public String sing(){
        System.out.println(name+"正在唱歌");
        return "谢谢大家！";
    }

    public void dance(){
        System.out.println(name+"正在跳舞");
    }

}
