package com.github.nacosfegin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class NacosFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosFeginApplication.class, args);
    }

    @Autowired
    private RemoteClient remoteClient;

    @GetMapping("/feign")
    public String test() {
        return remoteClient.helloNacos();
    }
}
