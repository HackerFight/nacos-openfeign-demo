package com.qiuguan.boot.cloud.client;

import com.qiuguan.boot.cloud.config.CdbClientConfig;
import com.qiuguan.boot.cloud.fallback.MockServerFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiuguan
 *
 * 如果指定了url:
 *  则请求路径是：http://localhost:9090/mock   (如果不是http开头，他会默认加上http)
 *
 * 如果没有指定url:
 *  则请求路径是：http://mock-server3/mock
 *  注意：这种情况下的 name(value)也是必须要有的，只不过名称随便起
 */
@FeignClient(name = "mock-server",
        url = "http://localhost:9090",
        configuration = CdbClientConfig.class,
        fallback = MockServerFallback.class
)
public interface MockClient {

    @GetMapping("/mock")
    String mock();
}
