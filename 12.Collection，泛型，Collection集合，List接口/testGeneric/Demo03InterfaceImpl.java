package com.hqyj.cl.day12.testGeneric;

public class Demo03InterfaceImpl implements Demo03Interface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
