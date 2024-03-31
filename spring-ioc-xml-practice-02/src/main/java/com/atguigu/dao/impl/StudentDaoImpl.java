package com.atguigu.dao.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @ClassName: StudentDaoImpl
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 10:42 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 10:42 2024/03/29
 * @Version: 1.0
 */

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Student> queryAll() {
        String sql = "select id, name, age, gender , class as classes from students ;";
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return studentList;
    }
}
