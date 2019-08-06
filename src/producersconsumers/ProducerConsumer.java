package producersconsumers;

import java.util.ArrayList;

class ProducerConsumer {
    ArrayList<Integer> list = new ArrayList<>();
    private int initialSize = 10;

    public synchronized void produce() throws InterruptedException {
        while (true){
            while (list.size() == initialSize) {
                wait(1000);
            }
            System.out.println("produce" + list);
            list.add((int) (Math.random() * 100));
            System.out.println(list);
            notifyAll();
            Thread.sleep(1500);
        }

    }

    public synchronized void consume() throws InterruptedException {
        while (true){
            while (list.size() == 0) {
                System.out.println("consume");
                wait(1000);
            }
            System.out.println("consume list" + list);
            list.remove((int) (Math.random() * list.size()));
            notifyAll();
            Thread.sleep(1500);
        }


    }
}