package com.cloud.human.social.service.impl;

import com.cloud.human.social.manager.HumanSocialManager;
import com.cloud.human.social.service.HumanSocialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class HumanSocialServiceImpl implements HumanSocialService {
    @Resource
    private HumanSocialManager humanSocialManager;

    @Override
    public String getFinanceInfo(){
        return humanSocialManager.getFinanceInfo();
    }

}
