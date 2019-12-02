package hki.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ZHANG.HAO
 * @Date: 2019-11-27 18:05
 * @Description:
 */
@RestController
public class NacosProviderController {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string){
        return "Hello Nacos Discovery " + string;
    }

}
