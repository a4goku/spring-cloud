package com.cloud.human.social.manager.impl;

import com.cloud.human.social.manager.HumanSocialManager;
import org.springframework.stereotype.Service;


@Service
public class HumanSocialManagerImpl implements HumanSocialManager {
//    @Resource
//    private FinanceControllerClient financeControllerClient;

    @Override
    public String getFinanceInfo(){
//        return financeControllerClient.getFinanceInfo();
        return "test manager";
    }
}
