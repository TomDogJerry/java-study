package com.hqyj.cl.day14.testThread;

/*java.lang.thread 不需要导包*/
/*
*
*   1.定义Thread类的子类，并重写该类的run()方法，该run()方法的方法体就代表了线程需要完成的任务,因此把 run()方法称为线程执行体。
    2.创建Thread子类的实例，即创建了线程对象
    3.调用线程对象的start()方法来启动该线程，执行run方法
* */
public class DemoThread01 extends Thread{

    public DemoThread01(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + i);
        }
    }
}
