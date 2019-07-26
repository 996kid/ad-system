package com.kid.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yuyh
 * @desription
 * @date 2019/7/25
 */
@SpringCloudApplication
@EnableZuulProxy
public class AdGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdGatewayApplication.class, args);
    }

}
