package com.bdg.agharibyan.producersandconsumers.viaarraylist;

//public class Consumer implements Runnable {
//
//    private Thread thread;
//    private ArrayList arrayList;
//
//    public Consumer(ArrayList arrayList){
//        this.arrayList = arrayList;
//        thread = new Thread();
//        thread.start();
//    }
//
//    @Override
//    public void run() {
//        ArrayList.remove();
//    }
//}

//consumeri hamar naev Threadic extend linogh tarberakn em grel, qani vor ayl Classic extend anelu anhrazheshtutyun chunenq ays depqum im jokelov :)
public class Consumer extends Thread{

    private ArrayList arrayList;

    public Consumer(ArrayList arrayList){
        this.arrayList = arrayList;
    }

    public void run(){
        ArrayList.remove();
    }
}

