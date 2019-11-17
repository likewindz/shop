package com.t248.member.service;

import com.t248.weixin.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 会员服务接口
 */
public interface MemberService {

    @GetMapping("/member")
    AppEntity getMemberInfo();

}
