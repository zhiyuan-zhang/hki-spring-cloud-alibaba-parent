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
    public void receiveInput1(String receiveMsg) {
        System.out.println("input1 receive: " + receiveMsg);
    }
}
