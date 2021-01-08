package com.hqyj.cl.day9.test03;

public class TestZi {
    public static void main(String[] args) {
        Zi zi = new Zi();
        Fu fu = new Fu();

        //多态
        Fu f = new Zi();
        f.methodB();

    }
}
