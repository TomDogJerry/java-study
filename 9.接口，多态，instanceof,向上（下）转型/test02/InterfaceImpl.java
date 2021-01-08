package com.hqyj.cl.day9.test02;
/*
* 1、如果一个实现类实现了多个接口，必须重写每个接口中所有的抽象方法（方法名不一样）
* 2、如果多实现接口中，存在方法名一样的方法，只需要重写一次
* 3、如果一个实现类继承一个父类，实现多个接口，父类中有和接口中同名的方法，优先访问父类
*
* */
public class InterfaceImpl extends Fu implements Interface01,Interface02 {

    @Override
    public void methodA() {
        System.out.println("这是重写第一个接口的方法");
    }

    @Override
    public void methodC() {
        System.out.println("这是重写两个接口中相同方法名称的方法");
    }

    @Override
    public void methodB() {
        System.out.println("这是重写第二个接口的方法");
    }
}
