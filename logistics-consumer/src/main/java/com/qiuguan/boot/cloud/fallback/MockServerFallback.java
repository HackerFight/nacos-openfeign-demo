package com.qiuguan.boot.cloud.fallback;

import com.qiuguan.boot.cloud.client.MockClient;

/**
 * @author qiuguan
 */
public class MockServerFallback implements MockClient {

    @Override
    public String mock() {
       return "调用 fallback 服务进行降级......";
    }
}
