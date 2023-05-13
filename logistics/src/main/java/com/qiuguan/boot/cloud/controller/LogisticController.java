package com.qiuguan.boot.cloud.controller;

import com.qiuguan.boot.cloud.client.Pay2Client;
import com.qiuguan.boot.cloud.client.PayClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuguan
 */
@RestController
public class LogisticController {

    /**
     * 声明式
     */
    @Autowired
    private PayClient payClient;

    /**
     * 继承式
     */
    @Autowired
    private Pay2Client pay2Client;

    @RequestMapping("/consumer/call.pay")
    public String callProvider() {
        return payClient.list();
    }

    @RequestMapping("/consumer/call.pay2")
    public String call2Provider() {
        return pay2Client.list();
    }
}
