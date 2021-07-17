package com.kuang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud.config
 * @Author: cxy
 * @Date: 2021/7/16 19:49
 * @Description: TODO
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced//负载均衡实现RestTemplate
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
