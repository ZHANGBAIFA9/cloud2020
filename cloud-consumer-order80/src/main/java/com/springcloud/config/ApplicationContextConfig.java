package com.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Create By BF On 2020/4/22
 */
@Configuration
public class ApplicationContextConfig {
    //@Bean  -- 相当于配置注入
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate() ;
    }
}
