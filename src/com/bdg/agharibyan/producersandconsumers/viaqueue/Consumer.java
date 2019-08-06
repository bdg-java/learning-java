package com.bdg.agharibyan.producersandconsumers.viaqueue;

public class Consumer implements Runnable {

    private Thread thread;
    private Queue queue;

    public Consumer(Queue queue){
        this.queue = queue;
        thread = new Thread();
        thread.start();
    }

    @Override
    public void run() {
        if (Queue.isFull()) {
            System.out.println("removing is done");
            Queue.remove();
        }
    }
}
