package com.hqyj.cl.day6;

public class Demo01 {
    //成员变量,不进行初始化，有默认的值
    String name;


    public static void main(String[] args) {
        //创建对象
        Demo01 d = new Demo01();
        d.show();
        //局部变量,要使用必须先进行初始化
        int age;
        age = 1;
        System.out.println(age);

        //for循环中的变量在外面不能访问
//        for (int i = 0; i < 10; i++) {
//            int sum = 1;
//        }
//        System.out.println(sum);
//
    }

    public void show(){
        System.out.println(name);
    }
}
