package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String welcome() {
        return "This is a private message";
    }

    @GetMapping("/getUsers")
    public String getUsers(){
        return "{\"name\":\"paul\"}";
    }
}
