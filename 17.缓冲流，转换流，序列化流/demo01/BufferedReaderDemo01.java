package com.hqyj.cl.day17.demo01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* 使用步骤:
    1.创建字符缓冲输入流对象,构造方法中传递字符输入流
    2.使用字符缓冲输入流对象中的方法read/readLine读取文本
    3.释放资源
* */
public class BufferedReaderDemo01 {
    public static void main(String[] args) throws IOException {
        //创建BufferedReader实例对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\aaa\\test01.txt"));
        //使用字符缓冲输入流对象中的方法read/readLine读取
/*        String b;
        //readLine()方法下一个没有数据返回的是null。不是-1
        while ((b = br.readLine()) != null){
            System.out.println(b);
        }*/
        char[] cbuf = new char[1024];
        int len;
        while ((len = br.read(cbuf))!= -1){
            System.out.println(new String(cbuf,0,len));
        }
        //释放资源
        br.close();
    }
}
