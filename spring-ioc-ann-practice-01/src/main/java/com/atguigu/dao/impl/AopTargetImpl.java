package com.atguigu.dao.impl;

import com.atguigu.dao.AopTarget;
import org.springframework.stereotype.Component;

/**
 * @ClassName: AopTargetImpl
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 16:05 2024/03/30
 * @Modified By: bin.zhao
 * @Modify Time: 16:05 2024/03/30
 * @Version: 1.0
 */

@Component
public class AopTargetImpl implements AopTarget {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public double div(int a, int b) {

        return a/b;
    }
}
