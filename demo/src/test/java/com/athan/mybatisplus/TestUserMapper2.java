package com.athan.mybatisplus;

import com.athan.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试
 *
 * @author athan dongdong980327@163.copm
 * @version 2022/3/7 17:15
 * @since jdk11
 */
@SpringBootTest
public class TestUserMapper2 {

    @Test
    public void testSelectById(){
        User user= new User();
        user.setId(2l);
        User user1 = user.selectById();
        System.out.println(user1);
    }

    @Test
    public void testInsert(){
        User user= new User();
        user.setName("bailongma");
        user.setPassword("22222");
        user.setUserName("白龙马");
        user.setEmail("2222.com");
        user.setAge(22);
        boolean insert = user.insert();
        System.out.println(insert?"成功":"失败");
    }


}
