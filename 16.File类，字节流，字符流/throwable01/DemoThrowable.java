package com.hqyj.cl.day14.throwable01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.lang.throwable 类是所有异常类的超类
*       Exception：编译时异常：程序必须通过自己来处理这样的异常，否则程序无法编译。  simpleDateFormat 中的parse方法
*                  运行时异常：程序可以有两种选择，第一种，程序员自己手动使用try--catch处理，第二种，交给jvm虚拟机处理
*                  如果是程序员用try--catch的方式处理，那么可以自己设置出现异常后执行什么代码
*                  如果是交给jvm虚拟机处理，那么jvm虚拟机就会把该异常类创建一个对象，异常信息（原因，类型，位置）以红色的字体颜色打印在控制台
*                  Exception是可以通过程序员修改代码等方式让程序直接运行的
*
*       Error：错误，不可以通过try--catch等方式来解决，必须修改源代码。
*
* */
public class DemoThrowable {
    public static void main(String[] args) {
        //编译时异常事例
        //先创建一个SimpleDateFormat对象
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = sdf.parse("2020-12-10");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);

        int[] arr = {1,2,3,4};
        int element = getElement(arr, 1);//ArrayIndexOutOfBoundsException
        System.out.println(element);

//        int[] brr = new int[1024*1024*1024];
//        System.out.println(brr[0]);

    }

    public static int getElement(int[] arr,int index){
        int ele = arr[index];
        return ele;
    }
}
