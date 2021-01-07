package com.hqyj.cl.day12.testGeneric;

public class TestDemo03InterfaceImp{
    public static void main(String[] args) {
        Demo03InterfaceImpl di = new Demo03InterfaceImpl();
        di.method("hello");

        Demo03InterfaceImpl02<String> di2 = new Demo03InterfaceImpl02<>();
        di2.method("JAVA IS EASY");

        Demo03InterfaceImpl02<Integer> di3 = new Demo03InterfaceImpl02<>();
        di3.method(1999);
    }
}
