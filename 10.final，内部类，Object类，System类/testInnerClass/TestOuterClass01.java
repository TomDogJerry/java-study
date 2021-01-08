package com.hqyj.cl.day10.testInnerClass;

public class TestOuterClass01 {
    public static void main(String[] args) {
        //在外部类创建一个boolean类型变量，内部类访问这个，判断为真还是为假，如果为真，输出心脏跳动，如果为假，输出心脏不跳动，
        //然后改变这个变量的值（取反），再一次调用这个方法，输出内容

        //创建外部类对象
        OuterClass01 o = new OuterClass01();
        //外部类名.内部类名 对象名 = new 外部类型().new 内部类型()；
        OuterClass01.InnerClass01 oi = o.new InnerClass01();
        //调用成员内部类中的方法isJump()
        oi.isJump();
    }
}
