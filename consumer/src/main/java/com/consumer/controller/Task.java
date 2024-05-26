//package com.consumer.controller;
//
//import org.apache.dubbo.config.annotation.DubboReference;
//import org.example.service.HelloService;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//public class Task implements CommandLineRunner {
//    @DubboReference(version = "1.0")
//    private HelloService helloService;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        String result = helloService.sayHello("task");
//        System.out.println("Receive result ======> " + result);
//
//        new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println(new Date() + " Receive result ======> " + helloService.sayHello());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                    Thread.currentThread().interrupt();
//                }
//            }
//        }).start();
//    }
//}
