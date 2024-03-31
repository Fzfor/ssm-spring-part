package com.atguigu.controller;

import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @ClassName: AnnController
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 16:04 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 16:04 2024/03/29
 * @Version: 1.0
 */

@Controller
public class AnnController {

    @Autowired
    @Qualifier(value = "a2")
    private StudentService studentService;

    @Value("2")
    private int age;

    public void controller() {
        studentService.queryAll();
    }
}
