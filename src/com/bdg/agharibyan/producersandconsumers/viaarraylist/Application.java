package com.bdg.agharibyan.producersandconsumers.viaarraylist;


public class Application {
    public static void main(String[] args) {
        int sizeOfArray = 10;
        int countOfThread = 5;

        ArrayList myArray = new ArrayList(sizeOfArray);

        Producer[] ProducersArray = new Producer[countOfThread];
        Consumer[] ConsumersArray = new Consumer[countOfThread];

        for(int n = 0; n < countOfThread; n++) {
            ProducersArray[n] = new Producer(myArray);
            ConsumersArray[n] = new Consumer(myArray);
        }

        while (true) {  // inchu chem karoghanum cikly pakel nakhqan souty? - unreachable statement e grum, bayc inchu chem haskanum(
            for (int j = 0; j < sizeOfArray/countOfThread; j++) {
                for(int i = 0; i < countOfThread; i++){
                    ProducersArray[i].run();
                //    ProducersArray[i].notifyAll(); //notyfyAll kancheri depqum IllegalMonitorStateException em unenum, miguce Applicationum chem da grelu, chgitem
                }
            }

            for (int k = 0; k < sizeOfArray/countOfThread; k++) {
                for(int f = 0; f < countOfThread; f++) {
                    ConsumersArray[k].run();
                //    ConsumersArray[f].notifyAll();
                }
            }
            System.out.println(myArray);
        }
    }
}
