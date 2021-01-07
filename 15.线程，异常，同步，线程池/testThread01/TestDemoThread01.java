package com.hqyj.cl.day15.testThread01;
/*
* 测试类
* */
public class TestDemoThread01 {
    public static void main(String[] args) {
        //创建线程类的对象
        DemoThread01 dt = new DemoThread01("线程dt");
        //调用start方法，启动另外一个线程
        dt.start();
    }
}
