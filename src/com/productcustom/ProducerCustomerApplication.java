package com.productcustom;

public class ProducerCustomerApplication {
    public static void main(String[] args) throws InterruptedException {
        final int count = 5;
        ProducerCustomer pc = new ProducerCustomer();
        Thread[] product = new Thread[count];
        Thread[] customer = new Thread[count];
        for (int i = 0; i < count; i++) {
            product[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        pc.producerAdd();
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());

                    }
                }
            });

            customer[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        pc.customerRemove();
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            });
            product[i].join();
            customer[i].join();
            product[i].start();
            customer[i].start();

        }
    }
}

