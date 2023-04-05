package com.wjj.usercenter.service;

import com.wjj.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;


    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        // 增
        valueOperations.set("wjjString", "0");
        valueOperations.set("wjjInt", 1);
        valueOperations.set("wjjDouble", 2.0);
        User user = new User();
        user.setId(3L);
        user.setUsername("wjj");
        valueOperations.set("wjjUser", user);
        // 查
        Object wjj = valueOperations.get("wjjString");
        Assertions.assertTrue("0".equals((String) wjj));
        wjj = valueOperations.get("wjjInt");
        Assertions.assertTrue(1 == ((Integer) wjj));
        wjj = valueOperations.get("wjjDouble");
        Assertions.assertTrue(2.0 == ((Double) wjj));
        System.out.println(valueOperations.get("wjjUser"));
        valueOperations.set("wjjString", "0");
        redisTemplate.delete("wjjString");


    }
}
