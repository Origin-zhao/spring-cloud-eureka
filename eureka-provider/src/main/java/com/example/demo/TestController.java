package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/3.
 */
@RestController
public class TestController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/getinfo")
    public String getInfo(){

        ServiceInstance instance = client.getLocalServiceInstance();

        System.out.println("======================");
        System.out.println(instance.getHost());
        System.out.println(instance.getServiceId());
        System.out.println("======================");
        return  instance.getServiceId();
    }

}
