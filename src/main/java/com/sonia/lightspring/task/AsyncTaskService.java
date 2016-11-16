package com.sonia.lightspring.task;

import org.springframework.scheduling.annotation.Async;
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
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("async task ...." + i);
    }
    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("async task2 ... " + i);
    }
}
