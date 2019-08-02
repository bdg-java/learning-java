package src.com.bdg;

import java.awt.*;
import java.util.PriorityQueue;

public class ProducerCunsomerProblemSolution extends Thread {
    static PriorityQueue<Integer> resource = new PriorityQueue<>();


    static class Produce extends Thread {
        @Override
        public void run() {
            int num = (int) (Math.random() * (9 - 1) + 9);
            resource.add(num);
        }

    }

    static class Consume extends Thread {
        @Override
        public void run() {
            resource.peek();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread[] producers = new Produce[5];
         Thread[] cunsumers = new Consume[5];

        for (int i = 0; i < producers.length; i++) {
            producers[i] = new Produce();
            cunsumers[i] = new Consume();
        }
        for (int i = 0; i < producers.length; i++) {
            producers[i].start();
            cunsumers[i].start();
        }

        System.out.println(resource.toArray().toString());

        /*while (true){

        }*/

    }

    @Override
    public void run() {


    }
}
    /*public void syncronized insert(){
        for (int i = 0; i <producers.length ; i++) {
            resource.add()
        }
    }*/




