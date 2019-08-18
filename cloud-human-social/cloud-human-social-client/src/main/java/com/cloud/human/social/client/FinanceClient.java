package com.cloud.human.social.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("cloud-finance")
@RequestMapping("/finance")
public interface FinanceClient {
    @GetMapping("/financeInfo")
    String getFinanceInfo();
}
