package com.atguigu.dao.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.rowset.JdbcRowSet;
import java.util.List;

/**
 * @ClassName: StudentDaoImpl
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 18:44 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 18:44 2024/03/29
 * @Version: 1.0
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> queryAll() {
        String sql = "select id, name, age, gender , class as classes from students;";
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return studentList;
    }
}
