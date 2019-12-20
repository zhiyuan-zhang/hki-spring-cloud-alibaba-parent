package hki.spring.cloud.alibaba.rocketmq.provider;

import hki.spring.cloud.alibaba.rocketmq.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

/**
 * @Auther: ZHANG.HAO
 * @Date: 2019-12-20 14:28
 * @Description:
 */

@SpringBootApplication
@EnableBinding({Source.class})
public class RocketMQProviderApplication  implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(RocketMQProviderApplication.class, args);

    }

//
//    public interface MySource {
//
//        @Output("output1")
//        MessageChannel output1();
//
//        @Output("output2")
//        MessageChannel output2();
//
//        @Output("output3")
//        MessageChannel output3();
//
//    }
//
    @Autowired
    private ProviderService providerService;

    @Override
    public void run(String... args) throws Exception {
        providerService.send("hki RocketMQ");
    }
}
