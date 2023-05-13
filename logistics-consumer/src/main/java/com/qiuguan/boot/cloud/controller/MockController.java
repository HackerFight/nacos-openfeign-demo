package com.qiuguan.boot.cloud.controller;

import com.qiuguan.boot.cloud.client.MockClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuguan
 */
@RestController
public class MockController {

    @Autowired
    private MockClient mockClient;

    @GetMapping("/consumer/mockdemo")
    public String mock(){
        return this.mockClient.mock();
    }
}
