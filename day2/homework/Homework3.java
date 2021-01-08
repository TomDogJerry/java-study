package com.hqyj.cl.day2.homework;

public class Homework3 {
    /*
     * 3.计算2000年1月1日到2008年1月1日相距多少天
     * 四年一闰,百年不闰,四百年再闰.
     * 如果不是整百年，i % 4 == 0,就是一个闰年；如果是整百年，i % 400 == 0,就是一个闰年
     * */
    public static void main(String []args) {
        int sum = 0;
        int day;
        for (int i = 2000; i < 2008; i++) {
            if (((i % 4 == 0)&&(i % 100 != 0))|| (i % 400 == 0)) {
                day = 366;
            } else {
                day = 365;
            }
            sum = sum + day;
        }
        System.out.println(sum);

    }
}
