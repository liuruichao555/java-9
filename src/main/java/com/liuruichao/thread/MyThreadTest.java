package com.liuruichao.thread;

import java.time.Instant;

/**
 * MyThreadTest
 *
 * @author liuruichao
 * Created on 2018/9/4 21:35
 */
public class MyThreadTest {
    public static void main(String[] args) {
        var thread = new Thread(new MyThread());
        thread.start();
    }

    private static class MyThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println(Instant.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
