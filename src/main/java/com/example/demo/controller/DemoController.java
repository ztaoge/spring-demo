package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    //@Autowired
    //DemoApi demoApi;

    @GetMapping(name = "hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "fuck";
    }


}
