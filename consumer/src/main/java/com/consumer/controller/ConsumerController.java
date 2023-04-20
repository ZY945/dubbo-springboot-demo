package com.consumer.controller;

import com.consumer.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 伍六七
 * @date 2023/4/20 18:00
 */
@RestController
public class ConsumerController {

//    /**
//     * http请求只能请求api
//     */
//    @Autowired
//    private RestTemplate restTemplate;
//    @GetMapping("/rest")
//    public String hello(){
//        return restTemplate.getForObject("localhost:8082/hello", String.class);
//    }


    @Autowired
    private DubboService dubboService;

    @GetMapping("/dubbo")
    public String sayHello() {
        return dubboService.sayHello();
    }
}
