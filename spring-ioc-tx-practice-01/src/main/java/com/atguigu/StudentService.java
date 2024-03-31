package com.atguigu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    
    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void changeInfo(){
        studentDao.updateAgeById(66,1);
        int a = 1/0;
        System.out.println("-----------");
        studentDao.updateNameById("test2",1);
    }
}
