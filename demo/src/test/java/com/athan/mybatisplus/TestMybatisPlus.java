package com.athan.mybatisplus;

import com.athan.mybatisplus.mapper.UserMapper;
import com.athan.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author athan dongdong980327@163.copm
 * @version 2022/3/7 13:44
 * @since jdk11
 */
@SpringBootTest
public class TestMybatisPlus {

    @Autowired
private UserMapper userMapper;

    @Test
    public void testInsert(){
        User user =new User();
        user.setEmail("1@ad.com");
        user.setAge(10);
        user.setUserName("小王");
        user.setPassword("222222");
        user.setName("caocoa");

        int insert = this.userMapper.insert(user);
        System.out.println(insert);



    }

    @Test
    public void testSelectPage(){
        Page<User> page =new Page<>(1,2);


        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("email","qq");
        IPage<User> userPage = userMapper.selectPage(page, queryWrapper);


        System.out.println("数据总条数"+page.getSize());
        System.out.println("数据总页数"+page.getPages());
        System.out.println("当前页数"+page.getCurrent());
        List<User> records = userPage.getRecords();
        for (User record : records) {

            System.out.println(record);
        }
    }

}
