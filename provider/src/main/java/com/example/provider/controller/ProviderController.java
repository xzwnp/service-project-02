package com.example.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * com.example.provider.controller
 *
 * @author xiaozhiwei
 * 2023/5/6
 * 14:18
 */
    @RestController
    @RequestMapping("api/provider")
    public class ProviderController {
        @Value("${server.port}")
        private String port;

        @GetMapping
        public String get() {
            return port + "--这是一个get方法";
        }

        @PostMapping
        public String post() {
            return port + "--这是一个post方法";
        }

        @PutMapping
        public String put() {
            return port + "--这是一个put方法";
        }

        @DeleteMapping
        public String delete() {
            return port + "--这是一个delete方法";
        }
    }
