package com.example.Spring_Project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HomePage {
    @GetMapping("/test")
    public String test(){
        return "Hello All";
    }

    @GetMapping("/wellcome")
    public String wellcome(){
        return "Wellcome to Aws Lambda Spring Boot Application";
    }
}
