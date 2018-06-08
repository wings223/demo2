package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test1(){

        return "hello world!";
    }
}
