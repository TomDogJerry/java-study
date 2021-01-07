package com.hqyj.jdbc;

import java.sql.*;

/*
DQL
 */
public class JdbcDemo6 {
    public static void main(String[] args){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db6", "root", "1234");
            String sql = "select * from account";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            //处理结果
            //1.让游标向下移动一行
            rs.next();
            //2.获取数据
            int id = rs.getInt(1);
            String name = rs.getString("name");
            double balance = rs.getDouble(3);
            System.out.println(id+"---"+name+"---"+balance);
            //1.让游标向下移动一行
            rs.next();
            //2.获取数据
            int id1 = rs.getInt(1);
            String name1 = rs.getString("name");
            double balance1 = rs.getDouble(3);
            System.out.println(id1+"---"+name1+"---"+balance1);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
