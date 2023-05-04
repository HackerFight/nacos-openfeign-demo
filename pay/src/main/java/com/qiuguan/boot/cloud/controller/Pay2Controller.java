package com.qiuguan.boot.cloud.controller;

import com.qiuguan.cloud.api.PayApi;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author qiuguan
 */
@RestController
public class Pay2Controller implements PayApi {

    @Override
    public String list() {
        return Arrays.asList("天涯", "海角", "内蒙", "赤峰").toString();
    }
}
