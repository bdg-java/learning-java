package com.bdg.agharibyan.producersandconsumers;

public class Producer extends Thread{

    Producer (String name){
        super(name);
    }

    public void run(long j){
        Queue newQueue = new Queue(10); //Amen angam nor Queue es sarqum, Harkavora ogtagorcel nuyn queue
        //Amen Producer ira sephakan Queue-n uni es depqum SXALA :D
//        if(newQueue.getRear() == newQueue.getMaxSize()-1){
//            newQueue.setRear(-1);
//        }
//        newQueue.setQueueArray(); //pordzeci insert methodn amboghjutyamb aystegh grel, chstacvec, ays toghum kang ara :(

        newQueue.insert((long)Math.random());
    }
}
