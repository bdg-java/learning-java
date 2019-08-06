package com.bdg.agharibyan.producersandconsumers.testwithquestions.synchronizedmethodbyusingannonymousclass;

public class TestSynchronization3{
    public static void main(String args[]){
        final Table obj = new Table();//only one object

        Thread t1=new Thread(){ //chisht em haskanum, vor annonymous classy chhaytararvats classn e, erb miangamic object enq steghtsum?
            public void run(){
                obj.printTable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
