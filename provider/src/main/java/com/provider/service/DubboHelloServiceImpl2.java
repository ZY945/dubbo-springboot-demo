package com.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.service.HelloService;

/**
 * @author 伍六七
 * @date 2023/4/20 22:05
 */
@DubboService(version = "2.0")
public class DubboHelloServiceImpl2 implements HelloService {
    @Override
    public String sayHello(String name) {
        return "dubbo2:hello,"+name;
    }
}
