package com.hqyj.cl.day2.homework;

public class Homework2 {
    /*
     * 2.打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
     * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方
     * */
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("水仙花数有：");
        for (int i = 100; i <= 999; i++) {
            c = i / 100;
            b = (i % 100) / 10;
            a = i % 10;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println(i);
            }
        }
    }
}
