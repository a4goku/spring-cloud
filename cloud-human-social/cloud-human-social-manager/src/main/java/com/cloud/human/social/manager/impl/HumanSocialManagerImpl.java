package com.cloud.human.social.manager.impl;

import com.cloud.human.social.client.FinanceClient;
import com.cloud.human.social.manager.HumanSocialManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class HumanSocialManagerImpl implements HumanSocialManager {
    @Resource
    private FinanceClient financeClient;

    @Override
    public String getFinanceInfo(){
        return financeClient.getFinanceInfo();
    }
}
