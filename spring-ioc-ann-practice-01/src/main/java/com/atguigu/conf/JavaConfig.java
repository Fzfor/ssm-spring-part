package com.atguigu.conf;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.pojo.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @ClassName: JavaConfig
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 18:44 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 18:44 2024/03/29
 * @Version: 1.0
 */

@Configuration
@ComponentScan("com.atguigu")
@PropertySource("classpath:jdbc.properties")
public class JavaConfig {

    @Bean
    public DataSource dataSource(@Value("${atguigu.url}") String url,
                                 @Value("${atguigu.driver}") String driver,
                                 @Value("${atguigu.username}") String username,
                                 @Value("${atguigu.password}") String password){
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);


        return dataSource;

    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean(/*initMethod = "init", destroyMethod = "destroy"*/)
    public Student student(){
        return new Student();
    }
}
