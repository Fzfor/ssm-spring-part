package com.atguigu;

import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @ClassName: StudentController
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 18:58 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 18:58 2024/03/29
 * @Version: 1.0
 */

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    public void queryAll() {
        List<Student> students = studentService.queryAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
