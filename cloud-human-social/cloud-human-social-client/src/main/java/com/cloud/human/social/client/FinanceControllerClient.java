package com.cloud.human.social.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "/cloud-finance")
public interface FinanceControllerClient {
    @GetMapping("/humanSocial/humanInfo")
    String getFinanceInfo();
}
