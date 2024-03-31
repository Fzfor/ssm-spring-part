package com.atguigu.advice;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PointCutConfig
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 16:12 2024/03/30
 * @Modified By: bin.zhao
 * @Modify Time: 16:12 2024/03/30
 * @Version: 1.0
 */
@Component
@Configuration
@ComponentScan("com.atguigu")
@EnableAspectJAutoProxy
public class PointCutConfig {
    @Pointcut("execution(* com.atguigu.dao.impl.*.*(..))")
    public void pointCut() {
    }
}
