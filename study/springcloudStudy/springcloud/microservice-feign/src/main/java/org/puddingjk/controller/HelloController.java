package org.puddingjk.controller;

import org.puddingjk.inter.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    TestService testService;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return testService.sayHiFromClientOne(name);
    }
}
