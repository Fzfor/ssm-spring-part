package com.atguigu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: DaoDemo
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 19:23 2024/03/30
 * @Modified By: bin.zhao
 * @Modify Time: 19:23 2024/03/30
 * @Version: 1.0
 */
@Repository
public class DaoDemo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void query(){
        String sql = "select id, name, age, gender, class as classes from students";

        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        studentList.forEach(System.out::println);

    }
}
