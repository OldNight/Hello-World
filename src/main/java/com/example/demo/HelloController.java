package com.example.demo;


import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @PostMapping("/")
  //  @RequestMapping("/")
    public String Hello(){
        return "Hello World!";
    }

    }


