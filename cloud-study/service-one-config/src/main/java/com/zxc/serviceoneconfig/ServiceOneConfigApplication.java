package com.zxc.serviceoneconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceOneConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOneConfigApplication.class, args);
    }

    @Value("${service.one.config.message}")
    private String name;

    @RequestMapping(value = "/service-one", method = RequestMethod.GET)
    public String serviceOneName() {
        return name;
    }

}
