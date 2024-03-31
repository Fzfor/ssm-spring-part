package com.atguigu.dao;

import com.atguigu.pojo.Student;

import java.util.List;

/**
 * @ClassName: StudentDao
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 18:43 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 18:43 2024/03/29
 * @Version: 1.0
 */

public interface StudentDao {
    List<Student> queryAll();
}
