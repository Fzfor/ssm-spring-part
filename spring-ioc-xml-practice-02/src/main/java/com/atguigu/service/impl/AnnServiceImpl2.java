package com.atguigu.service.impl;

import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AnnServiceImpl1
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 16:04 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 16:04 2024/03/29
 * @Version: 1.0
 */

@Service("a2")
public class AnnServiceImpl2 implements StudentService {


    @Override
    public List<Student> queryAll() {
        System.out.println("AnnServiceImpl2 doWork");
        return null;
    }
}
