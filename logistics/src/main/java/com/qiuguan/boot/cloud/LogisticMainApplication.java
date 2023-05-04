package com.qiuguan.boot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qiuguan
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.qiuguan.boot.cloud.client")
@SpringBootApplication
public class LogisticMainApplication {

    public static void main(String[] args) {

        SpringApplication.run(LogisticMainApplication.class, args);
    }
}
