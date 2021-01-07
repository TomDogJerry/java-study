package com.hqyj.cl.day7.testMath;

public class DemoMath01 {
    public static void main(String[] args) {
        //1、public static double abs(double a) ：返回 double 值的绝对值。
        double i = Math.abs(-5);
        System.out.println(i);
        System.out.println(Math.abs(-5.1));

        //2、public static double ceil(double a) ：返回大于等于参数的最小的整数。
        System.out.println(Math.ceil(-3.3));
        System.out.println(Math.ceil(3.5));
        System.out.println(Math.ceil(5.1));

        //3、public static double floor(double a) ：返回小于等于参数大的整数。
        System.out.println(Math.floor(-3.3));
        System.out.println(Math.floor(3.5));
        System.out.println(Math.floor(5.1));

        //4、public static long round(double a) ：返回接近参数的long。(相当于四舍五入方法)
        //如果参数为负无穷大或小于或等于Long.MIN_VALUE的值，则结果等于Long.MIN_VALUE的值。
        //如果参数为正无穷大或大于或等于Long.MAX_VALUE的值，则结果等于Long.MAX_VALUE的值。
        System.out.println(Math.round(5.3));
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(-5.3));
        System.out.println(Math.round(-5.5));

        //5、public static double random() ：返回一个double值为正号，大于等于0.0 ，小于1.0。
        double m = Math.random();
        System.out.println(m);
    }
}
