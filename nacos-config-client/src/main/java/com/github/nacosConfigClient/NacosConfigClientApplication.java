package com.github.nacosConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huorong
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RefreshScope
public class NacosConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApplication.class, args);
    }

    @Value("${nacos.config:test}")
    private String config;
    @Value("${test}")
    private String test;

    @RequestMapping("/getValue")
    public String getValue() {
        return config;
    }

    @RequestMapping("/getTest")
    public String getTest() {
        return test;
    }
}
