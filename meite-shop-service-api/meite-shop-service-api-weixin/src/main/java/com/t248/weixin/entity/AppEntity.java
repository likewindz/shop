package com.t248.weixin.entity;

import lombok.Data;

/**
 * 测试实体类
 */
@Data
public class AppEntity {

    private Integer appId;

    private String appName;
    public AppEntity(){}

    public AppEntity(Integer appId, String appName) {
        this.appId = appId;
        this.appName = appName;
    }
}
