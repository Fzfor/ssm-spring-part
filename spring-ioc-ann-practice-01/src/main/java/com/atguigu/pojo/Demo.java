package com.atguigu.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName: Demo
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 19:07 2024/03/29
 * @Modified By: bin.zhao
 * @Modify Time: 19:07 2024/03/29
 * @Version: 1.0
 */

@Component
public class Demo {

    //@PostConstruct
    public void demo()
    {
        System.out.println("demo");
    }

    //@PreDestroy
    public void destroy()
    {
        System.out.println("destroy");
    }
}
