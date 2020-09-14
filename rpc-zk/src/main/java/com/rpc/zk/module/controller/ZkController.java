package com.rpc.zk.module.controller;

import com.rpc.zk.module.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqz
 * @description
 * @since 2020/9/11
 */
@RestController
@RequestMapping("/zk")
public class ZkController {

    @Autowired
    private LocalService localService;


    @GetMapping("/call/dubbo")
    public String call(){
        return localService.doBusiness();
    }

}
