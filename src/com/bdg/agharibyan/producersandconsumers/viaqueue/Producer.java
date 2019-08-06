package com.bdg.agharibyan.producersandconsumers.viaqueue;

import java.util.Random;

public class Producer implements Runnable{

    private Thread thread;
    private Queue queue;
    static Random rnd = new Random();

    public Producer(Queue queue){
        this.queue = queue;
        thread = new Thread();
        thread.start();
    }

    @Override
    public void run() {
            System.out.println("inserting is done");
            Queue.insert(rnd.nextLong());
    }
}
