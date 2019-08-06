package com.bdg.producer_consumer_problem;

import com.sun.jdi.InternalException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumerSolution main = new ProducerConsumerSolution();
         int numberOfValues = 5;
        Thread[] Producer = new Thread[numberOfValues];
        Thread[] Consumer = new Thread[numberOfValues];

        for (int i =0; i<numberOfValues;i++)  {
            Producer[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        main.producer();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
            },"Producer");

            Consumer[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        main.consumer();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            },"Consumer");

            Producer[i].start();
            Consumer[i].start();
            Producer[i].join();
            Producer[i].join();
        }



    }
}
