package com.olaspring.olaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class Olaspringcontroller {
    @GetMapping
    public String hello(){
        return "Olá Spring";
    }
}
