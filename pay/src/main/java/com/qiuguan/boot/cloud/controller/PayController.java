package com.qiuguan.boot.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author qiuguan
 */
@RestController
public class PayController {

    @GetMapping("/pay/list")
    public List<String> list(){
        return Arrays.asList("北京", "上海", "南京", "天津");
    }
}
