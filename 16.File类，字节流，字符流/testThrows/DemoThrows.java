package com.hqyj.cl.day14.testThrows;

import java.io.FileNotFoundException;

/*
* 抛出一个异常给方法调用者处理
*
* */
public class DemoThrows {
    public static void main(String[] args) throws FileNotFoundException {
//        int i = methodA("b.txt");
//        System.out.println(i);

        int j = methodB("c.tx");
        System.out.println(j);
    }

    public static int methodA(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")){
            throw new FileNotFoundException("文件名不相同");
        }
        return 1;
    }

    public static int methodB(String path) throws FileNotFoundException {
        if (!path.endsWith(".txt")){
            throw new FileNotFoundException("文件后缀名不对");
        }
        return 1;
    }
}
