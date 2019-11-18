package com.t248.weixin.service.impl;

import com.t248.weixin.entity.AppEntity;
import com.t248.weixin.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeiXinServiceImpl implements WeiXinService {
    @Override
    public AppEntity getApp() {
        throw new NullPointerException();
    }
}
