package org.puddingjk.controller;

import org.puddingjk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/index")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }


}