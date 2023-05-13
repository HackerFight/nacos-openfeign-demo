package com.qiuguan.cloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiuguan
 * @date 2023/05/11 20:23:02  星期四
 */
@FeignClient(name = "baidu-demo", url = "http://wwww.baidu.com")
public interface BaiduFeignClient {

    @GetMapping
    String baidu();
}
