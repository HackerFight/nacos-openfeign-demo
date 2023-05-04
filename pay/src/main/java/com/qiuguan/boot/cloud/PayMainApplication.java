package com.qiuguan.boot.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qiuguan
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PayMainApplication {

    public static void main(String[] args) {

        SpringApplication.run(PayMainApplication.class, args);
    }
}
