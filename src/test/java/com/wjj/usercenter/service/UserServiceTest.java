package com.wjj.usercenter.service;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.wjj.usercenter.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author Jie_744614347
 */
@SpringBootTest
class UserServiceTest {


    @Resource
    private UserService userService;

    @Test
    void testAddUser(){
        User user=new User();

        user.setUsername("wjj");
        user.setUserAccount("123");
        user.setAvatarUrl("https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png");
        user.setGender(0);
        user.setUserPassword("123");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "wjjwww";
        String userPassword = "";
        String checkPassword = "123456";
        String planetCode = "1";
//        密码为空
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
//        用户名太短
        userAccount = "wjj";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
//        密码太短
        userAccount = "wjjwww";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
//        特殊字符
        userAccount = "123 123";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
//        校验密码不同
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
//        账户重复
        userAccount = "123";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
//        插入数据
        userAccount = "wjjZero";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void testSearchUsersByTags(){
        List<String> tagNameList = Arrays.asList("java","python");
        List<User> userList = userService.searchUserByTags(tagNameList);
        System.out.println(userList.toString());
        Assert.assertNotNull(userList);
    }


}