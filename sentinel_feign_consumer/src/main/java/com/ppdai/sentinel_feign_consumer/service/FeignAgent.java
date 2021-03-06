package com.ppdai.sentinel_feign_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hxt
 * @version 1.0
 * @date 2020/12/19
 */
@FeignClient(value = "sentinel-feign-provider", fallback = FallbackService.class)
public interface FeignAgent {

    @GetMapping("/api/v1/hello/{hello}")
    String hello(@PathVariable(value = "hello") String hello);
}
