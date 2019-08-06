package com.bdg.producer_consumer_problem;

import com.bdg.testSynochronized.test.Consumer;

import java.util.ArrayList;
import java.util.Random;

public class ProducerConsumerSolution {
    private static ArrayList<Integer> list = new ArrayList<>();
   final private static Object obj = new Object();
    public void producer() throws InterruptedException {
        synchronized (obj){
            while (true){
                if(list.size() == 10){
                    System.out.println("List is full, waiting for adding...");
                    obj.wait();
                }else{
                    int value = new Random().nextInt(100);
                    if(value<=10){
                        Thread.sleep(1000);
                        System.out.println(list.size() + " : Producer was added " + value);
                        list.add(value);
                        obj.notify();

                    }
                }
            }
        }
    }

    public void consumer() throws InterruptedException{
        synchronized (obj){
        while (true){

             if(list.size() == 0){
                 System.out.println("Consumer waiting...");
                 obj.wait();
             }else{
                 System.out.println(list.size() + ": Consumer was added " + list.remove(0));
                 obj.notify();
             }
            }
        }
    }
}
