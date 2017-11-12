package com.yuda.service.impl;

import com.yuda.entity.User;
import com.yuda.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther yuda
 * Create on 2017/11/12 22:30.
 * Project_name :   HelloSSM
 * Package_name :   com.yuda.service.impl
 * Description  :   TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring.xml")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123");
        userService.insert(user);
    }

    @Test
    public void insertSelective() throws Exception {
        User user = new User();
        user.setUsername("张三");
        userService.insertSelective(user);
    }

    @Test
    public void insertList() throws Exception {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("李" + i);
            user.setPassword("瓦格纳" + (10 - i));
            users.add(user);
        }

        userService.insertList(users);
    }

    @Test
    public void update() throws Exception {
        User user = new User();
        user.setU_id(1);
        user.setUsername("更改");
        user.setPassword("更改");
        userService.update(user);
    }

}