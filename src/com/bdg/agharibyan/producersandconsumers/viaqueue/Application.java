package com.bdg.agharibyan.producersandconsumers.viaqueue;

public class Application {
    public static void main(String[] args) {

        int sizeOfQueue = 10;
        int countOfThread = 5;

        Queue myQueue = new Queue(sizeOfQueue);

        Producer[] ProducersArray = new Producer[countOfThread];
        Consumer[] ConsumersArray = new Consumer[countOfThread];

        while(true){
        for(int i = 0; i < countOfThread; i++) {
            ProducersArray[i] = new Producer(myQueue);
            ConsumersArray[i] = new Consumer(myQueue);
            ProducersArray[i].run();
            ConsumersArray[i].run();
            System.out.println(myQueue);
        }
        }
    }
}
