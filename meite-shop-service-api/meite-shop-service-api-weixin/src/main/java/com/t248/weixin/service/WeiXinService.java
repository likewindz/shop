package com.t248.weixin.service;

import com.t248.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  微信服务接口
 */
@Api(tags = "微信服务接口")
public interface WeiXinService {
    @ApiOperation(value = "微信登录")
    @GetMapping("/getApp")
    AppEntity getApp();

}
