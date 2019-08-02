package com.bdg.agharibyan.producersandconsumers;

public class Application {
    public static void main(String[] args) {

        Queue myQueue = new Queue(10);

        Producer Producer1 = new Producer("Producer" + 1);
        Producer Producer2 = new Producer("Producer" + 2);
        Producer Producer3 = new Producer("Producer" + 3);
        Producer Producer4 = new Producer("Producer" + 4);
        Producer Producer5 = new Producer("Producer" + 5);

        Producer1.start();
        Producer2.start();
        Producer3.start();
        Producer4.start();
        Producer5.start();

        Producer1.run((long)Math.random());
        Producer2.run((long)Math.random());
        Producer3.run((long)Math.random());
        Producer4.run((long)Math.random());
        Producer5.run((long)Math.random());

        for(int i = 1; i <= 5; i++){
        //    new Consumer("Consumer" + i).start(); // ok a aranc start talu run taly?
            new Consumer("Consumer" + i).run(); // ok a es greladzevy?
        }

        System.out.println(myQueue);

    }
}
