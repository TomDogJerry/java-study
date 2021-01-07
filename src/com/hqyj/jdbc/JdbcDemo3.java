package com.hqyj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 向account表修改一条记录update语句
 */
public class JdbcDemo3 {
    public static void main(String[] args){

        //1.导入驱动jar包
        //2.注册驱动
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //3.获取数据库连接对象
            //DriverManager.getConnection("jdbc:mysql://localhost:3306/db6","root","1234");
            conn = DriverManager.getConnection("jdbc:mysql:///db6","root","1234");

            //4.定义sql语句
            //String sql = "update account set balance=2000 where id=1";
            String sql = "update account set balance=2000 where id = 3";
            //5.获取执行sql的对象 Statement
            stmt = conn.createStatement();
            //6.执行sql
            int count = stmt.executeUpdate(sql);
            //7.处理结果
            System.out.println(count);
            if(count>0){
                System.out.println("修改成功！");
            }else{
                System.out.println("修改失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                //8.释放资源
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                //8.释放资源
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }




    }
}
