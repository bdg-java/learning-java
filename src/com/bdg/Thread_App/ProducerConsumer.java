package com.bdg.Thread_App;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {

                
        Random rand = new Random();
        int value = rand.nextInt(10);

        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>(10);

        new Thread()  {
            @Override
            public synchronized void run() {
                for (int i = 0; i <queue.size() ; i++) {
                    if (queue.size() == 10){
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                        try {
                            wait(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            }
        }
        }.start();

        new  Thread()  {
            @Override
            public synchronized void run() {
                for (int i = 0; i < queue.size(); i++)
                    if (queue.size() == 0) {
                        queue.add(value);
                    }else {
                        try {
                            wait(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            }
        }.start();
    }
}
