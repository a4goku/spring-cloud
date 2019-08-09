package com.cloud.human.social.manager.impl;

import com.cloud.human.social.client.FinanceControllerClient;
import com.cloud.human.social.manager.HumanSocialManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HumanSocialManagerImpl implements HumanSocialManager {
    @Resource
    private FinanceControllerClient financeControllerClient;

    @Override
    public String getFinanceInfo(){
        return financeControllerClient.getFinanceInfo();
    }
}
