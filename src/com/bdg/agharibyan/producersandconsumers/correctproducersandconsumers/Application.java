package com.bdg.agharibyan.producersandconsumers.correctproducersandconsumers;

public class Application {
    public static void main(String[] args) throws InterruptedException{

        Resource.sizeOfArray = 10;
        int Threads = 5;

        ProduceAndConsumeMethods pandc = new ProduceAndConsumeMethods();

        for(int i = 0; i < Threads; i++){
            Thread produce =  new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        pandc.produce();
                    } catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
            });

            Thread consume = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        pandc.consume();
                    } catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
            });

            produce.start();
            consume.start();
//            produce.join(); // inchu grem, ete ashkhatum e naev aranc dra
//            consume.join(); // inchu grem, ete ashkhatum e naev aranc dra
        }

        //indz dur chekav ayl lutsumy, vor chenq pahum principnery

    }
}
