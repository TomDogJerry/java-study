package com.hqyj.cl.day15.testBank;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestBank {
    public static void main(String[] args) {
        //创建银行对象
        Bank bank = new Bank();
        Object obj = new Object();
        //创建存钱线程
        Thread tadd = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        try {
                            System.out.println( Thread.currentThread().getName() +"获取到锁对象，调用wait方法，进入waiting状态，释放锁对象");
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println( Thread.currentThread().getName() + "从waiting状 态醒来，获取到锁对象，继续执行了");

                    }
                }
            }
        });

        //创建取钱线程
        Thread tsub = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "‐‐‐‐‐ 获取到锁对象,调用notify方法，释放锁对象");
                        obj.notify();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        //开启存钱线程
        tadd.start();
        //开启取钱线程
        tsub.start();

    }
    public synchronized void methodA(){

    }
}
