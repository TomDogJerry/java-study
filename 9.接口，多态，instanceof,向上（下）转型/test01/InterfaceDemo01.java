package com.hqyj.cl.day9.test01;
/*
* 接口定义方式：public + interface + 接口名{}
* 1、接口不能用来new对象
* 2、接口中的抽象方法，必须是public abstract修饰的，不写，也是public abstract
* 3、静态方法：只能通过接口名称.方法名来调用，不能通过实现类对象来调用，并且不能重写
* 4、默认方法：default不能省略，用于接口升级，实现类可以重写，可以不重写
* 5、接口中定义的方法只能是public修饰的(JDK8)
* 6、接口中没有构造方法
* 7、接口中定义的变量，必须只能用public static final修饰,并且必须给初值，不能重新再次赋值
* */
public interface InterfaceDemo01 {

    //定义一个抽象方法
    public abstract void methodA();
//    abstract void methodF();
//    public void methodC();
//    void methodD();

    //定义一个默认方法
    public default void methodB(){
        System.out.println("这是一个默认方法");
    }

    //定义一个静态方法
    public static void methodC(){
        System.out.println("这是一个静态方法");
    }

    //定义一个main方法
    public static void main(String[] args) {
        InterfaceDemo01.methodC();
        System.out.println(InterfaceDemo01.AGE);

    }

//    private void methodD(){
//
//    }

    //定义一个常量
    public static final int AGE = 18;



}
