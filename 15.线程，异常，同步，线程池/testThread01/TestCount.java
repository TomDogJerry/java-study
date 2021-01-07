package com.hqyj.cl.day15.testThread01;

public class TestCount {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前i的值为：" + i++);
        }

    }
}
