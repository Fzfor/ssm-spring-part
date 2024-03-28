package com.atguigu;

import com.atguigu.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author fzfor
 * @date 21:44 2024/03/28
 */
public class Test01 {

    @Test
    public void test01(){
        System.out.println("hello world");


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");

        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        String sql = "insert into students (id ,name, gender, age, class ) values(?, ?, ?, ?, ?)";

        int rows = jdbcTemplate.update(sql, 11, "大小明", "男", 18, "1班");

        System.out.println(rows);
    }


    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        String sql = "select * from students where id = ?";

        Student student = jdbcTemplate.queryForObject(sql, ( rs,  rowNum) -> {

                Student stu = new Student();

                stu.setId(rs.getInt("id"));
                stu.setName(rs.getString("name"));
                stu.setGender(rs.getString("gender"));
                stu.setAge(rs.getInt("age"));
                stu.setClasses(rs.getString("class"));

                return stu;
            }, 2);

        System.out.println(student);
    }


    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        String sql = "select id, name, age, gender, class as classes from students";

        List<Student> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        System.out.println(query);
    }
}
