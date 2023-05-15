package com.qiuguan.boot.cloud.controller;

import com.qiuguan.cloud.api.BaiduFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuguan
 * @date 2023/05/11 20:18:27  星期四
 *
 * 只启动 {@link com.qiuguan.boot.cloud.PayMainApplication} 就可以了，它会去扫描 common-api包下的
 * 标注了 {@link org.springframework.cloud.openfeign.FeignClient} 注解的bean,然后创建代理对象
 */
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@RestController
public class BaiduController {

    private final BaiduFeignClient feignClient;

    @GetMapping("/baidu")
    public String hello(){
        return this.feignClient.baidu();
    }
}
