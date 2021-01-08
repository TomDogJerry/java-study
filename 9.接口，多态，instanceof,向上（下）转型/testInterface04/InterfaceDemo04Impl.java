package com.hqyj.cl.day9.testInterface04;

public class InterfaceDemo04Impl implements TestInterfaceDemo04{

    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("发短信");
    }

    @Override
    public void sendMail() {
        System.out.println("发邮件");
    }
}
