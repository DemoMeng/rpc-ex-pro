package com.rpc.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mqz
 */
@SpringBootApplication
@EnableDubbo
public class RpcConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcConsumerApplication.class, args);
    }

}
