package com.hqyj.cl.day17.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
* 使用步骤:
    1.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称
    2.使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中(编码)
    3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
    4.释放资源
* */
public class OutputStreamWriterDemo01 {
    public static void main(String[] args) throws IOException {
        //创建OutputStreamWriter对象，默认编码UTF-8
        OutputStreamWriter osw  = new OutputStreamWriter(new FileOutputStream("D:\\aaa\\test01.txt"));
        //创建OutputStreamWriter对象，自己设置编码GBK
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("D:\\aaa\\test.txt"),"GBK");
        //使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中(编码)
        //UTF-8存储中文是三个字节
        osw2.write("你好");
        osw2.close();
        //GBK存储中文是2个字节
        osw.write("你好");
        osw.close();
    }
}
