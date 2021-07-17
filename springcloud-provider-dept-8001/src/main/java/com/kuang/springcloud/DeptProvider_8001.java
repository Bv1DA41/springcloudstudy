package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud
 * @Author: cxy
 * @Date: 2021/7/16 19:27
 * @Description: TODO
 */

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001.class, args);
    }
}
