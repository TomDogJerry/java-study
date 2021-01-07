package com.hqyj.cl.day15.testNotify;

public class TestNotify {
    //创建同步锁
    private static Object obj = new Object();
    //主线程
    public static void main(String[] args) {

        //线程一
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                   synchronized (obj){
                       System.out.println(Thread.currentThread().getName() + "获取到了同步锁，调用wait方法，进入waiting状态，释放锁");
                       try {
                           obj.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                    System.out.println(Thread.currentThread().getName() + "被某个线程中的notify方法唤醒，获取到锁");
                }
            }
        }).start();

        //线程二
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println(Thread.currentThread().getName() + "获取到了同步锁，调用wait方法，进入waiting状态，释放锁");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "被某个线程中的notify方法唤醒，获取到锁");
                }
            }
        }).start();

        //线程三
        new Thread(new Runnable() {
            @Override
            public void run() {

                    synchronized (obj){
                        System.out.println(Thread.currentThread().getName() + "获取到了同步锁，调用notify方法，随机唤醒一个线程");
//                        obj.notify();随机唤醒一个处于waiting状态的线程
                        obj.notifyAll();//唤醒所有处于waiting状态的线程
                    }
            }
        }).start();
    }
}
