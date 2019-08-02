package org.puddingjk.feign;

import org.puddingjk.service.PayService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-pay")
public interface PayFeign extends PayService {

}
