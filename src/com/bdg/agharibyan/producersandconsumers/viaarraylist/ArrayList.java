package com.bdg.agharibyan.producersandconsumers.viaarraylist;

public class ArrayList {
    static int maxSize;
    static int nElements;
    static long [] array;
    static int index;

    public ArrayList(int size){
        this.maxSize = size;
        this.nElements = 0;
        this.array = new long[size];
        this.index = 0;
    }

    public static synchronized void insert(long x){
        System.out.println("Insert is done");
        array[index] = x;
        index++;
        nElements++;

        if(index == maxSize){
            index = 0;
        }
    }

    public static synchronized void remove(){
        System.out.println("Remove is done");
        array[index] = 0;
        index++;
        nElements--;

        if(index == maxSize){
            index = 0;
        }
    }

    public String toString(){
        return "[" +
                array[0] + "," +
                array[1] + "," +
                array[2] + "," +
                array[3] + "," +
                array[4] + "," +
                array[5] + "," +
                array[6] + "," +
                array[7] + "," +
                array[8] + "," +
                array[9] +
                "]";
    }
}