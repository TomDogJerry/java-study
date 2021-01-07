package com.hqyj.cl.day17;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTCP {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端 发送数据");

        // 创建 Socket ( ip , port ), 确定连接地址和端口号
        Socket client = new Socket("localhost", 6666);
        // 获取流对象,输出流
        OutputStream os = client.getOutputStream();
        // 通过Scoket,获取 输入流对象
        InputStream in = client.getInputStream();
        while (true) {
            // 写出数据
            String s = new Scanner(System.in).next();
            os.write(s.getBytes());
            // 读取数据数据
            byte[] b = new byte[1024];
            int len = in.read(b);
            System.out.println(new String(b, 0, len));
        }
    }
}
