package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class DemoService {

    @RequestMapping("/demo2")
    public String demo2() {
        return "HAHAHA";
    }
}
