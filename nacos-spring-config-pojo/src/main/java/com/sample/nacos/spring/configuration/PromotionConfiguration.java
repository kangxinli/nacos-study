package com.sample.nacos.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.sample.nacos.spring.model.Promotion;

@Configuration
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
public class PromotionConfiguration {

    @Bean
    public Promotion promotion() {
        return new Promotion();
    }

}