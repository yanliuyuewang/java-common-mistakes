package org.geekbang.time.commonmistakes.threadpool.me;

/**
 * AUTHER: wangyue
 * TIME  : 2022/11/27 : 15:17
 */
public class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doing......");
    }
}
