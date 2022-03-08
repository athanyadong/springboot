package com.athan.mybatisplus;

import com.athan.mybatisplus.mapper.UserMapper;
import com.athan.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUser(){
        List<User> users = this.userMapper.selectList(null);
        for (User user : users) {

            System.out.println(user);
        }
    }


}
