# nacos-openfeign-demo 【openfeign整合nacos,做微服务调用】

## 1. openfeign的依赖导入<br>
## 2. 重复定义式和继承式使用feign <br>
## 3. nacos 注册中心配置连接
## 4. 模块说明
1. common-api: 定义公共模块
2. logistics: 消费者模块
3. pay: 生产者模块
4. mock-server: mock的服务

## 5.配置说明
1. SpringCloud OpenFeign在 2020.0.0版本之后不再使用Ribbon做负载均衡，而是使用spring-cloud-starter-loadbalancer，
   所以需要引入 spring-cloud-starter-loadbalancer 模块
2. 同样的也移除了hystrix的支持，如果需要做服务降级则需要自己引入 spring-cloud-starter-netflix-hystrix 依赖。参考[官网](https://github.com/spring-cloud/spring-cloud-openfeign/commit/8a08e1ec4b4f0d40193a4ea9c03afdeffe3110a6)
   <br>不过现在基本上都使用sentinel进行服务降级和限流