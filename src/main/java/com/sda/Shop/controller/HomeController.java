package com.sda.Shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //ta adnotacja służy
public class HomeController {

    @GetMapping("/home")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/home1")
    public String hello1() {
        return "Hello world 1 !";
    }


}

