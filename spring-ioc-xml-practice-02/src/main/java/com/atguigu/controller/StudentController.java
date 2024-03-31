package com.atguigu.controller;

import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;

import java.util.List;

/**
 * @ClassName: StudentController
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 10:49 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 10:49 2024/03/29
 * @Version: 1.0
 */

public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void queryAll() {
        List<Student> students = studentService.queryAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
