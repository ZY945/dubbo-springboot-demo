package com.consumer.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author 伍六七
 * @date 2023/4/20 22:13
 */
@Service
public class DubboService {

    @DubboReference(version = "1.0")
    private HelloService helloService;

    public String sayHello() {
        return helloService.sayHello();
    }
}
