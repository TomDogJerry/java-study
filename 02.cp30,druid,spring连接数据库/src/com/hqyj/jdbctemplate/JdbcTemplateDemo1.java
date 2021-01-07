package com.hqyj.jdbctemplate;

import com.hqyj.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update account set balance=5000 where id=?";
        int count = template.update(sql,2);
        System.out.println(count);
    }
}
