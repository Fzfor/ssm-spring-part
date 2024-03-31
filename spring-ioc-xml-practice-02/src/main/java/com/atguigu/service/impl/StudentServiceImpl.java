package com.atguigu.service.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;

import java.util.List;

/**
 * @ClassName: StudentServiceImpl
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 10:48 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 10:48 2024/03/29
 * @Version: 1.0
 */

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    @Override
    public List<Student> queryAll() {
        List<Student> students = studentDao.queryAll();
        return students;
    }
}
