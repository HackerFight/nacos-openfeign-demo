package com.qiuguan.boot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qiuguan
 */
@EnableFeignClients(basePackages = "com.qiuguan.cloud.api")
@EnableDiscoveryClient
@SpringBootApplication
public class PayMainApplication {

    public static void main(String[] args) {

        SpringApplication.run(PayMainApplication.class, args);
    }
}
