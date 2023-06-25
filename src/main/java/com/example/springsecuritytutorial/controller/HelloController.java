package com.example.springsecuritytutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        return "Hello "+name.toUpperCase(Locale.ROOT)+" !!!";
    }

}
