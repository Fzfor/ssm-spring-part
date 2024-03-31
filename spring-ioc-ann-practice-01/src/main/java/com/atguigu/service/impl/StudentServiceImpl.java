package com.atguigu.service.impl;

import com.atguigu.dao.StudentDao;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: StudentServiceImpl
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 18:42 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 18:42 2024/03/29
 * @Version: 1.0
 */

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> queryAll() {
        List<Student> students = studentDao.queryAll();
        return students;
    }
}
