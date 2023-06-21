package com.example.gateway.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : luohw
 * @create 2023/6/21 10:08
 */

@Controller
public class ErrorController {

    @RequestMapping("/error")
    public String error(){

        return "error";
    }
}
