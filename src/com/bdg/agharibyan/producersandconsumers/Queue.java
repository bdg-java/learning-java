package com.bdg.agharibyan.producersandconsumers;

public class Queue {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nElements;

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.nElements = 0;
    }

    public int getMaxSize(){
        return this.maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public long[] getQueueArray(){
        return this.queueArray;
    }

    public void setQueueArray(long[] queArray){
        this.queueArray = queArray;
    }

    public int getFront(){
        return this.front;
    }

    public void setFront(int front){
        this.front = front;
    }

    public int getRear(){
        return this.rear;
    }

    public void setRear(int rear){
        this.rear = rear;
    }

    public int getnElements(){
        return this.nElements;
    }

    public void setnElements(int nElements){
        this.nElements = nElements;
    }

    public void insert(long number){
        if(rear == maxSize - 1){
            rear = -1;
        }
        queueArray[++rear] = number;
        nElements++;
    }

    public long remove(){
        long temp = queueArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public boolean isFull(){
        return ((this.rear + 2 == this.front) || (this.front + this.maxSize - 2 == this.rear)) ;
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
