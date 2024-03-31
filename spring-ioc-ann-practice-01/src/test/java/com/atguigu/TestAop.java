package com.atguigu;

import com.atguigu.advice.PointCutConfig;
import com.atguigu.dao.AopTarget;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ClassName: TestAop
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 16:27 2024/03/30
 * @Modified By: bin.zhao
 * @Modify Time: 16:27 2024/03/30
 * @Version: 1.0
 */

@SpringJUnitConfig(PointCutConfig.class)
public class TestAop {
    @Autowired
    private AopTarget aopTarget;

    @Test
    public void testAop(){
        aopTarget.add(1, 2);
        System.out.println("------");
        aopTarget.div(1,2);
        System.out.println("------");
        aopTarget.div(0,0);
    }
}
