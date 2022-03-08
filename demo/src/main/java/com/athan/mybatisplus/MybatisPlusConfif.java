package com.athan.mybatisplus;

import com.athan.mybatisplus.plugins.MyInterceptor;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author athan dongdong980327@163.copm
 * @version 2022/3/7 15:51
 * @since jdk11
 */
@MapperScan("com.athan.mybatisplus.mapper")
@Configuration
public class MybatisPlusConfif {
    /**
     * 分页插件
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        return  new MybatisPlusInterceptor();
    }

    /**
     * 注入自定义的拦截器（插件）
     * @return
     */
    @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }

}

