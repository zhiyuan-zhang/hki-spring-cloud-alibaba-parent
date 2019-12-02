package hki.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: ZHANG.HAO
 * @Date: 2019-11-29 11:05
 * @Description:
 */
@Component
public class EchoServiceFallback implements  EchoService {
    @Override
    public String echo(String message) {
        return "请求失败, sentinel is OK";
    }
}
