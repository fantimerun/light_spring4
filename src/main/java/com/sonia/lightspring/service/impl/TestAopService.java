package com.sonia.lightspring.service.impl;

import com.sonia.lightspring.aop.annotation.Action;
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
public class TestAopService {
    @Action(name="test aop action ...")
    public void add(){
        System.out.println("test aop");
    }
}
