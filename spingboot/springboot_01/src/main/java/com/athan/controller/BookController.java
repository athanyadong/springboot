package com.athan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author athan dongdong980327@163.copm
 * @version 2022/3/8 9:57
 * @since jdk11
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("springboot is running");
        return "springboot is running..";
    }
}
