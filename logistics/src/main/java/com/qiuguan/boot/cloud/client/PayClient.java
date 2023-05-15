package com.qiuguan.boot.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiuguan
 *
 * 声明式，重复定义请求路径
 *
 * 这里name如果等于 pay-application， 那么消费者就无法启动，因为不能有2个 pay-application feign client bean 被创建
 * 所以我这里需要改名，由于没有application-name 是pay-application2，所以在调用的时候会报错（启动的时候不会)
 */
@FeignClient(name = "pay-application2"/*, url = "https://baidu.com", configuration = CdbClientConfig.class*/)
public interface PayClient {

    @GetMapping("/pay/list")
    String list();
}
