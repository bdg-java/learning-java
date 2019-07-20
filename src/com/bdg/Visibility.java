package com.bdg;

public class Visibility {

    private static int count = 0;

    static synchronized void increment(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count : " + count);
    }


    static class TestLock {
        private String name;

        public void updateName(String name) {
            synchronized (this) {
                this.name = name;
            }
        }

        static synchronized void changeName() {
            synchronized (TestLock.class) {
            }
        }
    }
}
