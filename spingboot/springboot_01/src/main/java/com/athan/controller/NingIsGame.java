package com.athan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试boot
 *
 * @author athan dongdong980327@163.copm
 * @version 2022/3/8 10:09
 * @since jdk11
 */
@RequestMapping("/games")
@RestController
public class NingIsGame {

    @GetMapping
    public String IsGame(){
        System.out.println("我在玩游戏");
        return "我在玩游戏";
    }

}
