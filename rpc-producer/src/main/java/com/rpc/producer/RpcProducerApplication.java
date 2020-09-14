package com.rpc.producer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mqz
 */

@EnableDubbo
@SpringBootApplication
public class RpcProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcProducerApplication.class, args);
    }

}
