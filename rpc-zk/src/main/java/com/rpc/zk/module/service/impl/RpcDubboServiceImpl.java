package com.rpc.zk.module.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.rpc.zk.module.service.RpcDubboService;

/**
 * @author mqz
 * @description
 * @since 2020/9/14
 *
 * 注意：
 *    这里使用的是DubboService  -> dubbo的1.0版本该注解命名为Service，随后改成DubboService
 *
 */
@Service(version = "1.0",timeout = 3000)
public class RpcDubboServiceImpl implements RpcDubboService {
    @Override
    public String hello() {
        return "welcome to the zk";
    }
}
