package com.bdg.producer_consumer_problem;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerQueue {
   private static volatile int numberOfValues = 5;
   private static Thread PArray[];
   private static Thread CArray[];
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(10);
        Lock lock = new ReentrantLock();
        PArray = new Thread[numberOfValues];
        CArray = new Thread[numberOfValues];

        for (int i = 0; i < PArray.length; i++) {
            PArray[i] = new Thread(() -> {
                try {
                    int value = 0;
                    while (true) {
                        while (blockingQueue.size() <= 10) {
                            blockingQueue.put(value);
                            System.out.println(Thread.currentThread().getName() + " " + blockingQueue);
                            value++;
                            Thread.sleep(1000);
                        }

                    }


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }, "ProducerConsumerQueue");

            CArray[i] = new Thread(() -> {
                try {
                    while (true) {
                        Thread.sleep(1000);
                        while (blockingQueue.size() == 10) {
                            int value = blockingQueue.take();
                            System.out.println( Thread.currentThread().getName() + " " + value);
                        }

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "Consumer");

            PArray[i].start();
            CArray[i].start();
            PArray[i].join();
            CArray[i].join();
        }





    }
}
