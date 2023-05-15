package com.qiuguan.boot.cloud.fallback;

import com.qiuguan.boot.cloud.client.MockClient;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


/**
 * @author qiuguan
 *
 * 注意：{@link FallbackFactory} 的泛型必须是 {@link org.springframework.cloud.openfeign.FeignClient} 注解标注的
 * 接口，否者该降级不会生效，还会报错。
 */
@Component
public class MockServerFallbackFactory implements FallbackFactory<MockClient> {

    @Override
    public MockClient create(Throwable cause) {
        //return String.format("fallback降级, cause: %s, time: %s", cause.getMessage(), LocalDateTime.now());
        return () -> String.format("fallback factory 降级, cause: %s, time: %s", cause, LocalDateTime.now());
    }
}
