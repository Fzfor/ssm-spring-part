package com.atguigu;

import com.atguigu.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ClassName: TestTx
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 21:39 2024/03/30
 * @Modified By: bin.zhao
 * @Modify Time: 21:39 2024/03/30
 * @Version: 1.0
 */
@SpringJUnitConfig(JavaConfig.class)
public class TestTx {
    @Autowired
    StudentService studentService;

    @Test
    public void test() {
        studentService.changeInfo();
    }
}
