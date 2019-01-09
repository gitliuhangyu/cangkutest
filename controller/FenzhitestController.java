package com.epipe.integration_jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FenzhitestController {

    @GetMapping("/")
    public String main(){
        return "测试分支好不好用";
    }
}
