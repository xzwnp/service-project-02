package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("rest")
public class RestTemplateController {
    private static final String BASE_URL = "http://service-provider/";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String get() {
        String message = restTemplate.getForObject(BASE_URL + "api/provider", String.class);
        return "生产者返回结果:" + message;
    }

    @PostMapping
    public String post() {
        String message = restTemplate.postForObject(BASE_URL + "api/provider", null, String.class);
        return "生产者返回结果:" + message;
    }

    @PutMapping
    public String put() {
        restTemplate.put(BASE_URL + "api/provider", null);
        return "生产者返回结果:" + null;
    }

    @DeleteMapping
    public String delete() {
        restTemplate.delete(BASE_URL + "api/provider");
        return "执行成功";
    }
}
