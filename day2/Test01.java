package com.hqyj.cl.day2;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(19) + 1;
        System.out.println(i);
    }
}
