package com.cloud.human.social.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/humanSocial")
public class HumanSocialController {
//    @Resource
//    private HumanSocialService humanSocialService;

    @GetMapping("/humanInfo")
    public String getHumanInfo(){
        String str = "Enter into function";
        System.out.println(str);
        return str;
    }

    @GetMapping("/financeInfo")
    public String getFinanceInfo(){
//        return humanSocialService.getFinanceInfo();
        return null;
    }
}
