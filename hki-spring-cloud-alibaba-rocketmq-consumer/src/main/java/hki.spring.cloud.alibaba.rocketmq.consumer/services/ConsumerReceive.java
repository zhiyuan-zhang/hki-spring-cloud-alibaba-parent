package hki.spring.cloud.alibaba.rocketmq.consumer.services;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @Auther: ZHANG.HAO
 * @Date: 2019-12-23 17:09
 * @Description:
 */
@Service
public class ConsumerReceive {

    @StreamListener("input")
    public void receiveInput(String arg){
        System.out.println("hello rocket mq : " + arg );

    }


}
