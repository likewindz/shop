package com.t248.member.service.impl;

import com.t248.member.feign.WeiXinServiceFeign;
import com.t248.member.service.MemberService;
import com.t248.weixin.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberServiceImpl  implements MemberService {
    @Autowired
    private WeiXinServiceFeign serviceFeign;

    @Override
    public AppEntity getMemberInfo() {
        return serviceFeign.getApp();
    }
}
