package com.t248.member.service;

import com.t248.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 会员服务接口
 */
@Api(tags = "会员服务接口")
public interface MemberService {

    @ApiOperation(value = "登录服务",response = AppEntity.class)
    @GetMapping("/member")
    AppEntity getMemberInfo();

}
