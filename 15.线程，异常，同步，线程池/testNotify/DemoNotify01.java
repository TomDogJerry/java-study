package com.hqyj.cl.day15.testNotify;

public class DemoNotify01 {
    //创建锁对象
    private static Object obj = new Object();

    //主线程
    public static void main(String[] args) {
        //创建线程一
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println(Thread.currentThread().getName() + "获得了同步锁，调用wait方法，进入waiting状态，释放同步锁");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "被其他线程notify(notifyAll)唤醒，进入等锁池");
                }
            }
        }).start();

        //创建线程二
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println(Thread.currentThread().getName() + "获得了同步锁，调用wait方法，进入waiting状态，释放同步锁");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "被其他线程notify(notifyAll)唤醒，进入等锁池");
                }
            }
        }).start();

        //创建线程三
        new Thread(new Runnable() {
            @Override
            public void run() {

                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "获得了同步锁，调用notify(notifyAll)方法，随机唤醒一个线程");
                        //obj.notify();
                        //obj.notifyAll();

                    }

            }
        }).start();
    }
}
