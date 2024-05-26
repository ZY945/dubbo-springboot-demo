package com.consumer.controller;

import com.consumer.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    private RemoteService dubboService;

    @GetMapping("/param")
    public String sayHelloParam(@RequestParam String name) {
        return dubboService.sayHello(name);
    }

    @GetMapping("/body")
    public String sayHelloBody(@RequestBody String name) {
        return dubboService.sayHello(name);
    }
}
