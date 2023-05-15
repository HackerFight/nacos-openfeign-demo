package com.qiuguan.boot.cloud.fallback;

import com.qiuguan.boot.cloud.client.MockClient;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author qiuguan
 *
 * 注意：MockServerFallback 需要实现MockClient，否则将会报错
 * Caused by: java.lang.IllegalStateException: Incompatible fallback instance. Fallback/fallbackFactory of
 * type class com.qiuguan.boot.cloud.fallback.MockServerFallback is not assignable to
 * interface com.qiuguan.boot.cloud.client.MockClient for feign client mock-server
 */
@Component
public class MockServerFallback implements MockClient {

    @Override
    public String mock() {
       return String.format("使用fallback进行降级，time：%s", LocalDateTime.now());
    }
}
