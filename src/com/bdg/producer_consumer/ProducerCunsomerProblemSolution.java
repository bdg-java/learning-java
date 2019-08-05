package src.com.bdg.producer_consumer;

import java.util.PriorityQueue;

import java.util.Random;

public class ProducerCunsomerProblemSolution extends Thread {
    private static PriorityQueue<Integer> resource = new PriorityQueue<>(10);
    private static int count = 0;

    private static Thread[] producers = new Produce[5];
    private static Thread[] consumers = new Consume[5];


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < producers.length; i++) {
            producers[i] = new Produce();
            consumers[i] = new Consume();
            producers[i].start();
            producers[i].setName("p" + (i + 1));
            consumers[i].setName("c"+(i+1));
        }
    }





    static class Produce extends Thread {
        @Override
        public void run() {
            int min = 1;
            int max = 99;
            int diff = max - min;
            Random random = new Random();
            int num = random.nextInt(diff + 1);
            num += min;
            for (int i = 0; i <10 ; i++) {
                synchronized (this) {
                     num = random.nextInt(diff + 1);
                    resource.add(num);
                    count++;
                    System.out.println(resource.toString()+" "+count);
                    if (count==10){
                        i=0;
                        consumers[i].run();
                    }
                }
            }
        }
    }

    static class Consume extends Thread {
        @Override
        public void run() {
            synchronized (this) {
                System.out.println("consume");
                resource.removeAll(resource);
                count--;
            }
        }
    }
}



