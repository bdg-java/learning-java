package com.bdg.agharibyan.producersandconsumers.viaarraylist;

import java.util.Random;

public class Producer implements Runnable {

    private Thread thread;
    private ArrayList arrayList;

    static Random rnd = new Random();

    public Producer(ArrayList arraylist){
        this.arrayList = arraylist;
        thread = new Thread();
        thread.start();
    }

    @Override
    public void run() {
        ArrayList.insert(rnd.nextLong());
    }
}
