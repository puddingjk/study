package org.puddingjk.service.impl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.puddingjk.feign.PayFeign;
import org.puddingjk.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Api(description = "会员接口")
public class DemoServiceImpl implements NumberService {

    @Autowired
    PayFeign feignService;
    @ApiOperation(value = "demo名称", httpMethod = "GET")
    public Map<String, Object> demo() {
        Map<String, Object> demo = feignService.demo();
        demo.put("pay","支付接口返回完成");
        return demo;
    }


    public void aa(){
//        feignService

        feignService.demo();
    }
}
