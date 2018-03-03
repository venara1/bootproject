package com.venara.sample.bp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public @ResponseBody String sayHello(HttpServletRequest request){
        return "Hello Praneetha!";
    }

}
