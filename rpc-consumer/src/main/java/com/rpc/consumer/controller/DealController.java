package com.rpc.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rpc.api.service.CommonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqz
 * @description
 * @since 2020/9/14
 */
@RestController
public class DealController {

    @Reference(version = "${rpc.version}")
    private CommonService commonService;


    @GetMapping("/call/{name}")
    public String call(@PathVariable("name") String name){
        return commonService.deal(name);
    }


}
