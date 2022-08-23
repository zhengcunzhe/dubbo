package com.zcz.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.InfoService;

@RestController
public class InfoController {

    //dumbo提供的Reference注解，用于调用远程服务
    @DubboReference(check = false)
    private InfoService infoService;

    @GetMapping("/getInfo")
    public String getInfo() {
        return infoService.getInfo();
    }
}
