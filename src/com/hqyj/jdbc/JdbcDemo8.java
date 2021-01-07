package com.hqyj.jdbc;

import com.hqyj.domain.Emp;
import com.hqyj.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo8 {
    public static void main(String[] args) {
        List<Emp> list = new JdbcDemo8().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }

    /**
     * 查询所有的emp对象
     * @return
     */
    public List<Emp> findAll(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        List<Emp> list = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///db6", "root", "1234");
            //3.定义sql
            String sql = "select * from emp";
            //4.获取执行sql的对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.遍历结果集，封装对象，装载到集合中
            list = new ArrayList<>();
            while(rs.next()){
                //获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                //创建Emp对象，并赋值
                Emp emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                //装载到集合中
                list.add(emp);
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
       return list;
    }

    /**
     * 演示JDBC工具类
     * @return
     */
    public List<Emp> findAll2(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        List<Emp> list = null;
        try {
           /* //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///db6", "root", "1234");*/
            conn = JDBCUtils.getConnection();
            //3.定义sql
            String sql = "select * from emp";
            //4.获取执行sql的对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.遍历结果集，封装对象，装载到集合中
            list = new ArrayList<>();
            while(rs.next()){
                //获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                //创建Emp对象，并赋值
                Emp emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                //装载到集合中
                list.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            /*if(rs!=null){
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
            }*/
            JDBCUtils.close(rs,stmt,conn);
        }
        return list;
    }
}
