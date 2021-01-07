package com.hqyj.jdbc;

import java.sql.*;

public class JdbcDemo7 {
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
            //判断是否是最后一行末尾
           while(rs.next()){
               //获取数据
               int id = rs.getInt(1);
               String name = rs.getString("name");
               double balance = rs.getDouble(3);
               System.out.println(id+"---"+name+"---"+balance);
           }
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
