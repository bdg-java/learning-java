package com.bdg.agharibyan.producersandconsumers;

public class Consumer extends Thread {

    Consumer (String name){
        super(name);
    }

    public void run(){
        //NUYNEL ESTEX amen consumer ira Quen uni
        Queue newQueue = new Queue(10);

        if(newQueue.isFull()) {
            newQueue.remove();
        }
    }
}
