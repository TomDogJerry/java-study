package com.hqyj.cl.day9.test01;

public class TestInterfaceDemo01 {
    public static void main(String[] args) {
        //接口不能用来创建对象
        //InterfaceDemo01 id = new InterfaceDemo01();

        //创建实现类对象
        InterfaceDemo01Impl id = new InterfaceDemo01Impl();
        //调用方法
        id.methodA();
        id.methodB();
        InterfaceDemo01.methodC();
    }
}
