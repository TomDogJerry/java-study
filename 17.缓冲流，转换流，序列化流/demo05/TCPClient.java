package com.hqyj.cl.day17.demo05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* 实现步骤:
    1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
    2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
    3.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
    4.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
    5.使用网络字节输入流InputStream对象中的方法read,读取服务器回写的数据
    6.释放资源(Socket)
* */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号 public Socket(String host, int port)
        Socket s = new Socket("localhost",6666);
        //2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        OutputStream os = s.getOutputStream();
        //3.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
        os.write("send message to server".getBytes());
        //4.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        InputStream is = s.getInputStream();
        // 5.使用网络字节输入流InputStream对象中的方法read,读取服务器回写的数据
        System.out.println("-----------");
        byte[] bytes = new byte[1024];
        int b = is.read(bytes);
        System.out.println(new String(bytes,0,b));
        //6.释放资源
        is.close();
        os.close();
        s.close();
    }
}

/*
* 练习题：修改代码，完成相互通信。
* 即，在不主动关闭程序的情况下，客户端和服务器端可以一直通信（聊天）。
* */