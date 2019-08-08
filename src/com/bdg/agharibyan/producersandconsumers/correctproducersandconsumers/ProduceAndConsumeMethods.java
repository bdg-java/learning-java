package com.bdg.agharibyan.producersandconsumers.correctproducersandconsumers;

import static com.bdg.agharibyan.producersandconsumers.correctproducersandconsumers.Resource.rnd;

public class ProduceAndConsumeMethods{

    public synchronized void produce() throws InterruptedException{
        while(true){
            while(Resource.arrayList.size() == Resource.sizeOfArray){
                wait();
            }
            Resource.arrayList.add(rnd.nextLong());
            System.out.println("inserting is done" + Thread.currentThread() + Resource.arrayList); //inchu e anyndhat nuyn thready insert anum?
            notifyAll();
            Thread.sleep(500);
        }
    }

    public synchronized void consume() throws InterruptedException{
        while(true){
            while(Resource.arrayList.size() == 0){
                wait();
            }
            Resource.arrayList.remove(Resource.arrayList.size()-1);
            System.out.println("removing is done" + Thread.currentThread() + Resource.arrayList);
            notifyAll();
            Thread.sleep(500);
        }
    }
}
