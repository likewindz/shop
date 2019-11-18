package com.t248.member.feign;


import com.t248.member.hystrix.WeiXinServiceHystrix;
import com.t248.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * WeChat服务消费者 继承服务接口实现代码复用feign
 */
@FeignClient(value = "app-t248-weixin", fallback = WeiXinServiceHystrix.class)
public interface WeiXinServiceFeign extends WeiXinService {
}
