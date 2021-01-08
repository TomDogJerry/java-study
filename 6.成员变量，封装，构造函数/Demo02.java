package com.hqyj.cl.day6;

/*
* 封装
* */
public class Demo02 {
    //定义属性
    private String name;
     int age;

    //name和age的访问方法
    //设置name的值
    public void setName(String n){
        name = n;
    }
    //访问name的值
    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }


    public int getAge() {
        if (age > 0 && age < 120){
            return age;
        }else {
            return 0;
        }
    }
}
