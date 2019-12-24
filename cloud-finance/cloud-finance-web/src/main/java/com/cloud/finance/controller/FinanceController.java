package com.cloud.finance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance")
public class FinanceController {

    @GetMapping("/financeInfo")
    public String getFinanceInfo(){
        String str = "This is a finance demo!";
        System.out.println("test upload");
        System.out.println(str);
        return str;
    }
}
