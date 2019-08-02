package org.puddingjk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MicroShopPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroShopPayApplication.class, args);
    }

}
