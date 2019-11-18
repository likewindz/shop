package com.t248.weixin;


import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableSwagger2Doc
public class WeiXinApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeiXinApplication.class, args);
    }
}
