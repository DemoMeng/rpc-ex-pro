package com.rpc.producer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.rpc.api.service.CommonService;

/**
 * @author mqz
 * @description
 * @since 2020/9/14
 * 注意：
 *   这里使用的是DubboService  -> dubbo的版本该注解命名为Service(com.alibaba.dubbo)，随后改成 DubboService(com.apache.dubbo)
 */
@Service(version = "${rpc.version}")
public class ProducerService implements CommonService {
    @Override
    public String deal(String param) {
        String result = String.format("【rpc-producer提供服务】：%s",param);
        return result;
    }
}
