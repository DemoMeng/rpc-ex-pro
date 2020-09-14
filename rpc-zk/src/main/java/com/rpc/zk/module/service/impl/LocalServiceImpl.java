package com.rpc.zk.module.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rpc.zk.module.service.RpcDubboService;
import com.rpc.zk.module.service.LocalService;
import org.springframework.stereotype.Service;

/**
 * @author mqz
 * @description
 * @since 2020/9/14
 */
@Service
public class LocalServiceImpl implements LocalService {


    @Reference(version = "1.0")
    RpcDubboService dubboService;


    @Override
    public String doBusiness() {
        System.out.println("调用dubboService");
        System.out.println("调用dubboService:"+dubboService.hello());
        System.out.println("调用dubboServcie");
        return "OK";
    }
}
