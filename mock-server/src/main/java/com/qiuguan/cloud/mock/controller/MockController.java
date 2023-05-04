package com.qiuguan.cloud.mock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuguan
 */
@RestController
public class MockController {

    @GetMapping("/mock")
    public String mock(){
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //int x = 1 / 0;
        return "八千里路云和月";
    }
}
