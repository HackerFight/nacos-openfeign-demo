package com.qiuguan.boot.cloud.controller;

import com.qiuguan.boot.cloud.client.MockClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuguan
 */
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@RestController
public class MockController {

    private final MockClient mockClient;

    @GetMapping("/consumer/mockdemo")
    public String mock(){
        return this.mockClient.mock();
    }
}
