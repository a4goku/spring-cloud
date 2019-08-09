package com.cloud.human.social.controller;

import com.cloud.human.social.service.HumanSocialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/humanSocial")
public class HumanSocialController {
    @Resource
    private HumanSocialService humanSocialService;

    @GetMapping("/humanInfo")
    public String getHumanInfo(){
        String str = "Enter into function";
        System.out.println(str);
        return str;
    }

    @GetMapping("/financeInfo")
    public String getFinanceInfo(){
        return humanSocialService.getFinanceInfo();
    }
}
