package com.sonia.lightspring;

import com.sonia.lightspring.service.HelloService;
import com.sonia.lightspring.service.impl.TestAopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description <br>
 *
 * @author johnny
 * @classname
 * @date 2016/11/16
 * @see
 */
public class Hello {
    public static void main(String[] args) {
        ApplicationContext ctx;
        ctx = new AnnotationConfigApplicationContext(ConfigBean.class,AopConfig.class);
        TestAopService service1 = ctx.getBean(TestAopService.class);
        service1.add();
        HelloService service = ctx.getBean(HelloService.class);

        service.sayHello();

    }
}
