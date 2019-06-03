package org.puddingjk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试使用
 */
@RestController
public class IndexController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/index")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
