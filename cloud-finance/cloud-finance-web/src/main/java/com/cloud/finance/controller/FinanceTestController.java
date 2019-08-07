package com.cloud.finance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance")
public class FinanceTestController {
    @GetMapping("test")
    public String executeTest(){
        String str = "This is a finance demo!";
        System.out.println(str);
        return str;
    }
}
