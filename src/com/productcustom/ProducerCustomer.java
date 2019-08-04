package com.productcustom;

import java.util.ArrayList;
import java.util.Random;

public class ProducerCustomer {
    final static int maxSize = 10;
    static ArrayList arrayOfNumbers = new ArrayList<Integer>();

    void producerAdd() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (arrayOfNumbers.size() == maxSize)
                    wait();
                arrayOfNumbers.add(new Random().nextDouble());
                notifyAll();
                System.out.println("Thread of producer " + Thread.currentThread() + arrayOfNumbers);
                Thread.sleep(1200);
            }
        }
    }

    void customerRemove() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (arrayOfNumbers.size() == 0)
                    wait();
                arrayOfNumbers.remove(arrayOfNumbers.size() - 1);
                notifyAll();
                System.out.println("Thread of customer " + Thread.currentThread() + arrayOfNumbers);
                Thread.sleep(1200);
            }
        }
    }
}
