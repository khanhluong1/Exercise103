package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }
}
