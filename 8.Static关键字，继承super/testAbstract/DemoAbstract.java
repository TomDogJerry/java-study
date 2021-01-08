package com.hqyj.cl.day8.testAbstract;

/*
* 1、普通类不能定义抽象方法，也就是说抽象方法必须定义在抽象类里面
* 2、抽象类里面可以定义普通方法
* 3、抽象类里面，一定要有抽象方法吗? 不一定
* 4、抽象类不能创建对象（不能new对象）
* 5、抽象类的子类（实现类）必须重写所有抽象方法
* */
public abstract class DemoAbstract {
    String name;
    static int age;

    //抽象方法
    public abstract void sing();
    public abstract void run();

    public void show(){
        System.out.println("哈哈哈");
    }

    public static void show1(){
        System.out.println("哈哈哈");
    }
}
