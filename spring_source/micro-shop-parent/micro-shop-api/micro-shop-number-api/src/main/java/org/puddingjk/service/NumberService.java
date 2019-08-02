package org.puddingjk.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/number")
public interface NumberService {

    @GetMapping("/demo")
    Map<String,Object> demo();
}
