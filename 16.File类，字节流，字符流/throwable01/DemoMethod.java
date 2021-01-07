package com.hqyj.cl.day14.throwable01;

import sun.java2d.pipe.SpanIterator;

public class DemoMethod {
    public static void main(String[] args) {
        int[] arr =null;

        try {
            System.out.println(arr[0]);
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
