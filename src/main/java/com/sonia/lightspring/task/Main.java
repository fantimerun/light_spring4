package com.sonia.lightspring.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description <br>
 *
 * @author johnny
 * @classname
 * @date 2016/11/16
 * @see
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service = ctx.getBean(AsyncTaskService.class);
        for (int i=0;i<10;i++){
            service.executeAsyncTask(i);
            service.executeAsyncTaskPlus(i);
        }
    }
}
