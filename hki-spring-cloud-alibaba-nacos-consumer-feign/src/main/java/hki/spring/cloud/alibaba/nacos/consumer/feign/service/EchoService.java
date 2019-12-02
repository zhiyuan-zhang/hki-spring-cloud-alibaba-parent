package hki.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: ZHANG.HAO
 * @Date: 2019-11-28 17:48
 * @Description:
 */
@FeignClient(value = "nacos-provider", fallback = EchoServiceFallback.class)
public interface EchoService {

    // 对方的controller是什么 接口就是什么
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}
