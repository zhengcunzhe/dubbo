package com.zcz.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import service.InfoService;

@Component
//dubbo提供的Service注解，用于声明对外暴露服务
@DubboService
public class InfoServiceImpl implements InfoService {

    @Override
    public String getInfo() {
        return "这里是provider模块";
    }
}
