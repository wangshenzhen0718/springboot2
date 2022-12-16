package com.wang.boot.controller;

import com.wang.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private  Car car;
    @RequestMapping("/hello")
    public String sayHello(){

        return "hello springboot2";

    }
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
