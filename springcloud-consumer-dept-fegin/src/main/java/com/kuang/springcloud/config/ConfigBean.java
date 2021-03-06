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


//    /**
//     * IRule:
//     * RoundRobinRule 轮询策略
//     * RandomRule 随机策略
//     * AvailabilityFilteringRule ： 会先过滤掉，跳闸，访问故障的服务~，对剩下的进行轮询~
//     * RetryRule ： 会先按照轮询获取服务~，如果服务获取失败，则会在指定的时间内进行，重试
//     */
//    @Bean
//    public IRule myRule() {
//        return new RandomRule();//使用随机策略
//        //return new RoundRobinRule();//使用轮询策略
//        //return new AvailabilityFilteringRule();//使用轮询策略
//        //return new RetryRule();//使用轮询策略
//    }



}
