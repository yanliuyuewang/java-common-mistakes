package org.geekbang.time.commonmistakes.threadpool.me;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * AUTHER: wangyue
 * TIME  : 2022/11/27 : 15:18
 */
public class pooldemo {

//    static ExecutorService executorService = Executors.newFixedThreadPool(7);
    static ExecutorService executorService = Executors.newFixedThreadPool(7);

    static List<Task> tasks =new ArrayList<>();


    static {
        for (int i = 0; i < 1000 ; i++) {
            tasks.add(new Task());
        }

    }

    public static void main(String[] args) {

        long l = System.currentTimeMillis();
//        tasks.forEach(executorService::submit);

        for (Task t :  tasks) {
            executorService.submit(t);
        }


        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE , TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l);
    }

}
