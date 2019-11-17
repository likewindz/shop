package com.t248.weixin.service;

import com.t248.weixin.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  微信服务接口
 */
public interface WeiXinService {
    @GetMapping("/getApp")
    AppEntity getApp();

}
