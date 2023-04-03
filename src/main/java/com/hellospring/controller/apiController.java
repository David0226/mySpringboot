package com.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {

    @GetMapping("/getdata")
    public String httpGet(){
        return "Get요청처리"
    }

}

