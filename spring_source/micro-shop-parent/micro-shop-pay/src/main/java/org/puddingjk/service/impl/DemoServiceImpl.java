package org.puddingjk.service.impl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.puddingjk.service.PayService;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(description = "支付接口")
public class DemoServiceImpl implements PayService {

    @ApiOperation(value = "demo名称", httpMethod = "GET")
    public Map<String, Object> demo() {
        HashMap<String, Object> stringObjectHashMap = new HashMap<String, Object>();
        stringObjectHashMap.put("number","支付接口返回完成....");
        return stringObjectHashMap;
    }
}
