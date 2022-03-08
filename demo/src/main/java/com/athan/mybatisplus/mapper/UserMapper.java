package com.athan.mybatisplus.mapper;


import com.athan.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author athan dongdong980327@163.copm
 * @version 2022/3/7 12:51
 * @since jdk11
 */
public interface UserMapper extends BaseMapper<User> {

    User findById(Long id);
}
