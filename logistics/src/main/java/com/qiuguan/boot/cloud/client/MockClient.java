package com.qiuguan.boot.cloud.client;

import com.qiuguan.boot.cloud.config.CdbClientConfig;
import com.qiuguan.boot.cloud.fallback.MockServerFallback;
import com.qiuguan.boot.cloud.fallback.MockServerFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiuguan
 *
 * 如果指定了url:
 *  则请求路径是：http://localhost:9090/mock   (如果不是http开头，他会默认加上http)
 *
 * 如果没有指定url:
 *  则请求路径是：http://mock-server/mock
 *  注意：这种情况下的 name(value)也是必须要有的，只不过名称随便起
 *
 *
 *  fallback 和 fallbackFactory 是用来降级的，这里需要导入hystrix
 *  如果二者同时指定，则fallback的优先级更高
 */
@FeignClient(name = "mock-server",
        url = "http://localhost:9090",
        configuration = CdbClientConfig.class,
        fallback = MockServerFallback.class
        ,
        fallbackFactory = MockServerFallbackFactory.class
)
public interface MockClient {

    @GetMapping("/mock")
    String mock();
}
