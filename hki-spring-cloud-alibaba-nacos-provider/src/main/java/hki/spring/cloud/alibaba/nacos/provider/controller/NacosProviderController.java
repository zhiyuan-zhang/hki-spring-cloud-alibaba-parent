package hki.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
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


    // 注入配置文件上下文
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    // 从上下文中读取配置
    @GetMapping(value = "/hi")
    public String sayHi() {
        // 实时获取刷新数据 保证拿到最新的
        return "Hello " + applicationContext.getEnvironment().getProperty("user.name");
    }


    // 注入配置文件上下文
    @Value("${user.name}")
    private String name;

    // 从上下文中读取配置
    @GetMapping(value = "/value")
    public String getName() {
        // 这个会写入内存 启动程序后再去更改配置 并不会改变
        return "Hello value = " + name;
    }


}
