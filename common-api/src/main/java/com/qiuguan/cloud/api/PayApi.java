package com.qiuguan.cloud.api;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiuguan
 *
 * 声明式会写多一次提供者接口的定义，也就是有重复的代码，既然有重复的定义，那我们就可以抽取出来，所以就有了继承式。
 *
 * 第一步，创建一个普通的Maven项目api工程，把接口定义在api中。
 */
public interface PayApi {

    @GetMapping("/pay/list2")
    String list();
}
