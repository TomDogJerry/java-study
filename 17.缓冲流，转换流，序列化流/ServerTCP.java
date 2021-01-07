package com.hqyj.cl.day17;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTCP {
    public static void main(String[] args) throws IOException, IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        // 创建 ServerSocket对象，绑定端口，开始等待连接
        ServerSocket ss = new ServerSocket(6666);
        // 接收连接 accept 方法, 返回 socket 对象.
        Socket server = ss.accept();
        // 通过socket 获取输入流
        InputStream is = server.getInputStream();
        // 通过 socket 获取输出流
        OutputStream out = server.getOutputStream();
        while (true) {
            // 创建字节数组
            byte[] b = new byte[1024];
            // 据读取到字节数组中.
            int len = is.read(b);
            // 解析数组,打印字符串信息
            System.out.println(new String(b, 0, len));
            // 回写数据
            String s = new Scanner(System.in).next();
            out.write(s.getBytes());
        }
    }
}
