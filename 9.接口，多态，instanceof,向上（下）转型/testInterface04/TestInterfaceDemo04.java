package com.hqyj.cl.day9.testInterface04;


//练习题：定义一个接口，里面有三个抽象方法，分别是发短信，打电话，发邮件
//还有2个默认方法，第一个默认方法分别输出A，输出B，输出C，来电提示；
//还有一个默认方法分别输出A，输出B，输出C，头像显示；
//要求：假如有一个华为手机，要求输出，华为手机发短信，华为手机打电话，华为手机发邮件
//分别输出A，输出B，输出C，头像显示；分别输出A，输出B，输出C，来电提示；
public interface TestInterfaceDemo04 {
    //定义打电话方法
    public abstract void call();
    //定义发短信方法
    public abstract void sendMessage();
    //定义发邮件方法
    public abstract void sendMail();

    //定义默认方法
    public default void methodA(){
        TestInterfaceDemo04.common();
        System.out.println("来电提示");
    }

    public default void methodB(){
        TestInterfaceDemo04.common();
        System.out.println("头像显示");
    }

    public static void common(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }

}
