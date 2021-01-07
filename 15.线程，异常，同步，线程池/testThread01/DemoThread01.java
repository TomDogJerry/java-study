package com.hqyj.cl.day15.testThread01;

/*
*
* public Thread():分配一个新的线程对象。
  public Thread(String name):分配一个指定名字的新的线程对象。
* */
public class DemoThread01 extends Thread{

    //无参构造
    public DemoThread01(){

    }

    //带参构造
    public DemoThread01(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //public static void sleep(long millis) :使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "-->" + i);
        }
    }
}
