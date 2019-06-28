package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.IHelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
@ResponseBody
public class HelloController {
    @Reference
    private IHelloService helloService;

    @RequestMapping("/getName")
    public String getName(String name) {
        //远程调用
        String result = helloService.sayHello(name);
        System.out.println(result);
        return result;
    }
}
