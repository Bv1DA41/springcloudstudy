package com.kuang.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: springcloud
 * @BelongsPackage: com.kuang.springcloud.myrule
 * @Author: cxy
 * @Date: 2021/7/17 22:21
 * @Description: TODO
 */
@Configuration
public class KuangRule {

    @Bean
    public IRule myRule() {
//        return new RandomRule();//使用随机策略
        //return new RoundRobinRule();//使用轮询策略
        //return new AvailabilityFilteringRule();//使用轮询策略
        //return new RetryRule();//使用轮询策略
        return new KuangRandomRule();//默认是轮询RandomRule,现在自定义为自己的

    }
}
