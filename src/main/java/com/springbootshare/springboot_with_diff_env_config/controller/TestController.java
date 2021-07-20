package com.springbootshare.springboot_with_diff_env_config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/greeting")
    public String saySomething() {
        return "Hello World";
    }
}
