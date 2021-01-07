package com.hqyj.cl.day15.testThreadSafe;

public class Demo {
    public static void main(String[] args) {
        //创建实现类对象
        Ticket t = new Ticket();
        //创建线程对象
        Thread t1 = new Thread(t,"窗口1");
        Thread t2 = new Thread(t,"窗口2");
        Thread t3 = new Thread(t,"窗口3");

        //开启线程
        t1.start();
        t2.start();
        t3.start();

    }
}
