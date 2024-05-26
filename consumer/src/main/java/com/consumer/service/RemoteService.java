package com.consumer.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author 伍六七
 * @date 2023/4/20 22:13
 */
@Service//这个是消费者的使用spring的service注入为bean
public class RemoteService{

    @DubboReference(version = "1.0",url = "dubbo://localhost:20880")
    private HelloService helloService;

    public String sayHello(String name) {
        try {
            return helloService.sayHello(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
