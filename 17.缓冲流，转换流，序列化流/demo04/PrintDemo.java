package com.hqyj.cl.day17.demo04;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
*改变打印的流向
**/
public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //默认输出流向-->控制台
        System.out.println(97);
        // 创建打印流,指定文件的名称
        PrintStream ps = new PrintStream("D:\\aaa\\test.txt");
        // 设置系统的打印流流向,输出到test.txt
        System.setOut(ps);
        //改变输出流向之后，输出97
        System.out.println(97);
        //释放资源
        ps.close();
    }
}
