package com.atguigu.service;

import com.atguigu.pojo.Student;

import java.util.List;

/**
 * @ClassName: StudentService
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 18:41 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 18:41 2024/03/29
 * @Version: 1.0
 */

public interface StudentService {
    List<Student> queryAll();
}
