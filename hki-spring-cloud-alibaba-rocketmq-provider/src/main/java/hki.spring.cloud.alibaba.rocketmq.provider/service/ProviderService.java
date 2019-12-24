package hki.spring.cloud.alibaba.rocketmq.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
//import org.springframework.messaging.support.MessageBuilder;

/**
 * @Auther: ZHANG.HAO
 * @Date: 2019-12-20 14:34
 * @Description:
 */
@Service
public class ProviderService {

    @Qualifier("output")
    @Autowired()
    MessageChannel aa;


    public void send(String str){

        Message<String> build = MessageBuilder.withPayload(str).build();
        MessageHeaders headers = build.getHeaders();
        String payload = build.getPayload();

        aa.send(build);
    }
}
