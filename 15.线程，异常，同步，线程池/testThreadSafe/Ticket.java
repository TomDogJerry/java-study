package com.hqyj.cl.day15.testThreadSafe;

/*
 * 事例分析：电影院要卖票，我们模拟电影院的卖票过程。假设要播放的电影是 “喜羊羊与灰太狼”，
 * 本次电影的座位共100个。 我们来模拟电影院的售票窗口，实现多个窗口同时卖 “喜羊羊与灰太狼”这场电影票(多个窗口一起卖这100张票) 需要窗口，
 * 采用线程对象来模拟；需要票，Runnable接口子类来模拟。
 * */


import com.hqyj.cl.day15.testBank.Bank;

import java.security.PublicKey;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 10;
    //1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    //同步锁对象
    Object obj = new Object();

/*    public synchronized void methodA() {
        if (ticket > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票");
            ticket--;
        }
    }*/

    @Override
    public void run() {

        while (true) {
/*            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票");
                    ticket--;
                }
            }*/
            //methodA();
            //2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
/*            l.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
                    l.unlock();
                }
            }*/

            if (ticket > 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
