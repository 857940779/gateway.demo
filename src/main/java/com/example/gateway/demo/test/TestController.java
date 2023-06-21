package com.example.gateway.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : luohw
 * @create 2023/6/20 14:12
 */

@RestController(value = "/test")
public class TestController {


    @RequestMapping(value = "/hello")
    public String hello(){
        return "-------hello";
    }
}
