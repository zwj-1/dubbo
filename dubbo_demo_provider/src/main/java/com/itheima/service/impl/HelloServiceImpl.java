package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.IHelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = IHelloService.class)
@Transactional
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
