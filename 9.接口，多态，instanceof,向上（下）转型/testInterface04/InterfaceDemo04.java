package com.hqyj.cl.day9.testInterface04;

public class InterfaceDemo04 {
    public static void main(String[] args) {
        InterfaceDemo04Impl id = new InterfaceDemo04Impl();
//        id.methodA();
//        id.methodB();

        TestInterfaceDemo04 ti = new InterfaceDemo04Impl();
        ti.call();

//        TestInterfaceDemo04 ti1 = new Test02();
//        ti1.call();

    }
}
