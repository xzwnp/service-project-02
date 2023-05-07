package com.example.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * com.example.consumer.feign
 *
 * @author xiaozhiwei
 * 2023/5/6
 * 14:32
 */
@FeignClient("service-provider")
@Component
public interface ProviderClient {
    @GetMapping("api/provider")
    String get();

    @PostMapping("api/provider")
    String post();

    @PutMapping("api/provider")
    String put();

    @DeleteMapping("api/provider")
    String delete();
}
