package com.sonia.lightspring.aop;

import com.sonia.lightspring.aop.annotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * description <br>
 *
 * @author johnny
 * @classname
 * @date 2016/11/16
 * @see
 */
@Aspect
@Component
public class ActionAspect {
    @Pointcut("@annotation(com.sonia.lightspring.aop.annotation.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint point){
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        Action action= method.getAnnotation(Action.class);
        System.out.println("after " + action.name());
    }

    @Before("execution(* com.sonia.lightspring.service.impl..*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("before ...");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("before"+action.name());
    }

}
