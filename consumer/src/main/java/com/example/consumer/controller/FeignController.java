package com.example.consumer.controller;

import com.example.consumer.feign.ProviderClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * com.example.consumer
 *
 * @author xiaozhiwei
 * 2023/5/6
 * 14:22
 */
@RestController
@RequestMapping("feign")
@Slf4j
public class FeignController {

    @Autowired
    ProviderClient providerClient;

    @GetMapping
    public String get() {
        String message = providerClient.get();
        log.info(message);
        return "生产者返回结果:" + message;
    }

    //post,put,delete代码与上述代码类似
    @PostMapping
    public String post() {
        String message = providerClient.post();
        return "生产者返回结果:" + message;
    }

    @PutMapping
    public String put() {
        String message = providerClient.put();
        return "生产者返回结果:" + message;
    }

    @DeleteMapping
    public String delete() {
        String message = providerClient.delete();
        return "生产者返回结果:" + message;
    }
}
