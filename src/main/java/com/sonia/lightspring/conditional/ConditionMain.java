package com.sonia.lightspring.conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description <br>
 *
 * @author johnny
 * @classname
 * @date 2016/11/17
 * @see
 */
public class ConditionMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService service = ctx.getBean(ListService.class);
        System.out.printf("%s,系统下的列表命令为: %s",ctx.getEnvironment().getProperty("os.name"),service.showListCmd());
    }
}
