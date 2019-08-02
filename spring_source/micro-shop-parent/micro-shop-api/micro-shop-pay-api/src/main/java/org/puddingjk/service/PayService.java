package org.puddingjk.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/pay")
public interface PayService {

    @GetMapping("/demo")
    Map<String,Object> demo();
}
