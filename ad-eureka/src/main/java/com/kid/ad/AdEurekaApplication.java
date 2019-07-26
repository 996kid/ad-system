package com.kid.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yuyh
 * @desription ad-eureka
 * @date 2019/7/25
 */
@SpringBootApplication
@EnableEurekaServer
public class AdEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdEurekaApplication.class,args);
    }
}
