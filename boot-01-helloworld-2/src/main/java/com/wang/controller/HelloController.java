package com.wang.controller;

import com.wang.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public Person sayHello() {
        return person;
    }
}
