package com.hqyj.cl.day17.demo01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
*使用步骤:
    1.创建字符缓冲输出流对象,构造方法中传递字符输出流
    2.调用字符缓冲输出流中的方法write,把数据写入到内存缓冲区中
    3.调用字符缓冲输出流中的方法flush,把内存缓冲区中的数据,刷新到文件中
    4.释放资源
* */
public class BufferedWriterDemo01 {
    public static void main(String[] args) throws IOException {
        //直接创建BufferedWriter的实例对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\aaa\\test.txt"));
        //调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        for (int i = 65; i < 80; i++) {
            bw.write(i);
            bw.newLine();
        }
        //刷新缓冲区
        bw.flush();
        //关闭流
        bw.close();
    }
}
