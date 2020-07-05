package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    @RequestMapping("/demo")
    public String  demo(){
        //测试代码

        return "我是springboot";

    }
}
