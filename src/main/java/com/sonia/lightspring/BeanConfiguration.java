package com.sonia.lightspring;

import com.sonia.lightspring.service.HelloService;
import com.sonia.lightspring.service.impl.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * description <br>
 *
 * @author johnny
 * @classname
 * @date 2016/11/16
 * @see
 */
@Configuration
public class BeanConfiguration {
    @Bean
    @Profile("dev")
    public HelloService getHelloService1(){
        return new HelloServiceImpl("dev");
    }

    @Bean
    @Profile("test")
    public HelloService getHelloService2(){
        return new HelloServiceImpl("test");
    }
}
