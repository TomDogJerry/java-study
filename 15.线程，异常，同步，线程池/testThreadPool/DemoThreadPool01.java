package com.hqyj.cl.day15.testThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
*
*   1.创建线程池对象
    ExecutorService service = Executors.newFixedThreadPool(int nThreads);。
    2.创建Runnable接口子类对象。
    MyRunnable r = new MyRunnable();
    3.提交Runnable接口子类对象。
    service.submit(r);
    4.关闭线程池(一般不做,因为其他线程还可能需要使用)。
            service.shutdown();
* */
public class DemoThreadPool01 {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(1);
        //  2.创建Runnable接口子类对象。
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //3.提交Runnable接口子类对象。
        service.submit(r);

        //创建Thread对象
//        Thread t = new Thread(r);
//        t.start();
        //4.关闭线程池(一般不做,因为其他线程还可能需要使用)。
        //service.shutdown();

        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        service.submit(r1);

    }
}
