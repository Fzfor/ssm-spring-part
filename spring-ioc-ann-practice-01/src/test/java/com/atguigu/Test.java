package com.atguigu;

import com.atguigu.conf.JavaConfig;
import com.atguigu.pojo.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Test
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 18:59 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 18:59 2024/03/29
 * @Version: 1.0
 */

public class Test {
    @org.junit.jupiter.api.Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = applicationContext.getBean(Student.class);
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.queryAll();
        applicationContext.close();
    }
}
