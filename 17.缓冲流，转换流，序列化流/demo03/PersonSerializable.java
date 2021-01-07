package com.hqyj.cl.day17.demo03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
使用步骤:
    1.创建ObjectOutputStream对象,构造方法中传递字节输出流
    2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
    3.释放资源
* */
public class PersonSerializable {
    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象,构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\aaa\\test01.txt"));
        //2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        oos.writeObject(new Person("张三",19,"重庆市"));
        //3.释放资源
        oos.close();
    }
}