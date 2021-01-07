package com.hqyj.cl.day17.demo01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
*  1.创建FileOutputStream对象,构造方法中绑定要输出的目的地
   2.创建BufferedOutputStream对象,构造方法中传递FileOutputStream对象,提高FileOutputStream对象效率
   3.使用BufferedOutputStream对象中的方法write,把数据写入到内部缓冲区中
   4.使用BufferedOutputStream对象中的方法flush,把内部缓冲区中的数据,刷新到文件中
   5.释放资源(会先调用flush方法刷新数据,第4部可以省略)
* */
public class BufferedOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //1.创建FileOutputStream对象,构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("D:\\aaa\\test01.txt",true);
        //2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象,提高FileOutputStream对象效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //3.使用BufferedOutputStream对象中的方法write,把数据写入到内部缓冲区中
/*        for (int i = 97; i < 105; i++) {
            bos.write(i);
        }*/
        byte[] bytes = "ABCDEFG".getBytes();
        bos.write(bytes);
        //4.使用BufferedOutputStream对象中的方法flush,把内部缓冲区中的数据,刷新到文件中
        bos.flush();
        //释放资源
        fos.close();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println("缓冲区方式使用时间为:" + (end - start) + "毫秒");
    }
}
