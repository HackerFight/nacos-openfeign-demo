package com.qiuguan.boot.cloud.client;

import com.qiuguan.cloud.api.PayApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author qiuguan
 *
 * 组合成就是：http://pay-application/pay/list2
 * @see MockClient
 */
@FeignClient("pay-application")
public interface Pay2Client extends PayApi {
}
