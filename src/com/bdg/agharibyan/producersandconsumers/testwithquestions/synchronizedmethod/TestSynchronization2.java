package com.bdg.agharibyan.producersandconsumers.testwithquestions.synchronizedmethod;

public class TestSynchronization2 {
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();

        //menq tarberak unenq inch-vor kerp arajnahertutyun talu t1 kam t2ic inch-vor mekin?
        // te drancic vor meky start klini arajiny misht voroshelu e oeracion hamakargy?
        //run anelis mi angam t1n e arajiny start linum, mi angam t2y.
    }
}
