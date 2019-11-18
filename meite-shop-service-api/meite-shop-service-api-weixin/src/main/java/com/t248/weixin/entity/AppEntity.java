package com.t248.weixin.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 测试实体类
 */
@Data
@ApiModel(value = "Result",description ="返回模型")
public class AppEntity {

    @ApiModelProperty(name = "登录code")
    private Integer appId;

    @ApiModelProperty(name = "登录密码")
    private String appName;
    public AppEntity(){}

    public AppEntity(Integer appId, String appName) {
        this.appId = appId;
        this.appName = appName;
    }
}
