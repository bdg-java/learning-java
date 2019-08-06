package com.bdg.agharibyan.producersandconsumers.viaqueue;

public class Queue {

    private static int maxSize;
    private static long[] queueArray;
    private static int front;
    private static int rear;
    private static int nElements;

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.nElements = 0;
    }

    public static synchronized void insert(long number){
        if(rear == maxSize - 1){
            rear = -1;
        }
        queueArray[++rear] = number;
        nElements++;
    }

    public static synchronized long remove(){
        long temp = queueArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        nElements--;
        return temp;
    }

    public static boolean isFull(){
        return (nElements == maxSize) ;
    }

    public String toString() {
        return "[" +
                queueArray[0] + "," +
                queueArray[1] + "," +
                queueArray[2] + "," +
                queueArray[3] + "," +
                queueArray[4] + "," +
                queueArray[5] + "," +
                queueArray[6] + "," +
                queueArray[7] + "," +
                queueArray[8] + "," +
                queueArray[9] +
                "]";
    }
}
