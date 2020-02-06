package com.github.nacosfegin;

import org.springframework.stereotype.Component;

@Component
public class RemoteHystrix implements RemoteClient {
    @Override
    public String helloNacos() {
        return "请求超时了";
    }
}