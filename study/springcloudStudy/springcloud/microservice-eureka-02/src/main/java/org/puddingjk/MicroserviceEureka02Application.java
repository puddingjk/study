package org.puddingjk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEureka02Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEureka02Application.class, args);
    }

}
