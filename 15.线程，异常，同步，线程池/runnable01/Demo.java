package com.hqyj.cl.day15.runnable01;

public class Demo {
    public static void main(String[] args) {
        //2.创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象。
        MyRunnable mr = new MyRunnable();
        //public Thread(Runnable target):分配一个带有指定目标新的线程对象。
        //public Thread(Runnable target,String name):分配一个带有指定目标新的线程对象并指定名字。
        Thread t = new Thread(mr);
        //3.调用线程对象的start()方法来启动线程。
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
