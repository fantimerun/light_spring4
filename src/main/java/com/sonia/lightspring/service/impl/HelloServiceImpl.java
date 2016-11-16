package com.sonia.lightspring.service.impl;

import com.sonia.lightspring.aop.annotation.Action;
import com.sonia.lightspring.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * description <br>
 *
 * @author johnny
 * @classname
 * @date 2016/11/16
 * @see
 */
@Service
public class HelloServiceImpl implements HelloService {
    private String world;
    public  HelloServiceImpl(String world){
        this.world = world;
    }
    @Action(name = "add 操作")
    public void sayHello() {
        System.out.println("Hello Sonia.");
    }

    @Override
    public java.lang.String hello() {
        return "Hello " + this.world;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
