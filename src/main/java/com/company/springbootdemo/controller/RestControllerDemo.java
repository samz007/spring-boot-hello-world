package com.company.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
    @RequestMapping("/hello")
    public String helloWorld() {
        return "hey congrats you have created hello-world spring boot application";
    }
}
