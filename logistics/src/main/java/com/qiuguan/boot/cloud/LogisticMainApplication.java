package com.qiuguan.boot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qiuguan
 */
@EnableFeignClients(basePackages = {"com.qiuguan.boot.cloud.client"})
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class LogisticMainApplication {

    public static void main(String[] args) {

        SpringApplication.run(LogisticMainApplication.class, args);
    }
}
