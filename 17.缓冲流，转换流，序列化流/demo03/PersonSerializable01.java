package com.hqyj.cl.day17.demo03;

import java.io.*;

/*
使用步骤:
    1.创建ObjectInputStream对象,构造方法中传递字节输入流
    2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
    3.释放资源
    4.使用读取出来的对象(打印)
* */
public class PersonSerializable01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建ObjectInputStream对象,构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("D:\\aaa\\test01.txt"));
        //2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        Object obj = ois.readObject();
        //3.释放资源
        ois.close();
        //4.打印对象
        System.out.println(obj);
    }
}