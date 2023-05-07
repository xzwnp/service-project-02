package com.example.consumer.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * com.example.provider.handler
 *
 * @author xiaozhiwei
 * 2023/5/6
 * 14:58
 */
@RestControllerAdvice
@Slf4j
public class MyExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        log.error("", e);
        return e.getMessage();
    }
}
