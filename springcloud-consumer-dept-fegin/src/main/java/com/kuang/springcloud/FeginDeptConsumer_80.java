package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud
 * @Author: cxy
 * @Date: 2021/7/16 20:08
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.kuang.springcloud"})
public class FeginDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeginDeptConsumer_80.class, args);
    }
}
