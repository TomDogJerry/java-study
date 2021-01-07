package com.hqyj.cl.day17.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 使用步骤:
   1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称
   2.使用InputStreamReader对象中的方法read读取文件
   3.释放资源
*
* */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws IOException {
        //1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\aaa\\test01.txt"));
        //创建InputStreamReader对象，自己设定编码
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("D:\\aaa\\test01.txt"),"GBK");
        //2.使用InputStreamReader对象中的方法read读取文件
        int b;
        System.out.println("默认编码表读取：");
        while ((b = isr.read())!=-1){
            System.out.print((char)b);
        }
        System.out.println();
        int c;
        System.out.println("指定编码表读取：");
        while ((c = isr2.read())!=-1){
            System.out.print((char)c);
        }
        isr2.close();
        isr.close();
    }
}
