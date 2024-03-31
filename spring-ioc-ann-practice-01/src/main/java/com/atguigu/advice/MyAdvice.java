package com.atguigu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: MyAdvice
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 16:06 2024/03/30
 * @Modified By: bin.zhao
 * @Modify Time: 16:06 2024/03/30
 * @Version: 1.0
 */
@Component
@Aspect
public class MyAdvice {

    @Before("com.atguigu.advice.PointCutConfig.pointCut()")
    public void before(JoinPoint joinPoint) {
        String targetClassName = joinPoint.getTarget().getClass().getSimpleName();
        System.out.println("targetClassName = " + targetClassName);
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        System.out.println("methodName = " + methodName);

        Object[] args = joinPoint.getArgs();
        List<Object> objects = Arrays.asList(args);
        System.out.println("method args = " + objects);
        System.out.println("开始计算");
    }

    @AfterReturning(value = "com.atguigu.advice.PointCutConfig.pointCut()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println("method name = " + name + ", running result = " + result);
        System.out.println("计算结束");
    }

    @AfterThrowing(value = "com.atguigu.advice.PointCutConfig.pointCut()", throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint, Throwable throwable) {
        String name = joinPoint.getSignature().getName();
        System.out.println("method name = " + name + "running error" + throwable);
    }
}
