package com.t248.member.hystrix;

import com.t248.member.feign.WeiXinServiceFeign;
import com.t248.weixin.entity.AppEntity;
import org.springframework.stereotype.Component;

@Component
public class WeiXinServiceHystrix implements WeiXinServiceFeign {
    @Override
    public AppEntity getApp() {
        return new AppEntity(250,"error");
    }
}
