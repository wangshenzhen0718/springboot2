package com.wang.boot.controller;

import com.wang.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class HelloController {
    @Autowired
    private  Car car;
    @RequestMapping("/hello")
    public String sayHello(){
        log.info("请求进来了");

        return "hello springboot2";

    }
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
