package com.atguigu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ClassName: Test
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 19:26 2024/03/30
 * @Modified By: bin.zhao
 * @Modify Time: 19:26 2024/03/30
 * @Version: 1.0
 */

@SpringJUnitConfig(JavaConf.class)
public class Test {

    @Autowired
    private DaoDemo daoDemo;

    @org.junit.jupiter.api.Test
    public void test() {
        daoDemo.query();
    }
}
