package com.hqyj.cl.day12.testGeneric;

public class Demo03InterfaceImpl02<E> implements Demo03Interface<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
