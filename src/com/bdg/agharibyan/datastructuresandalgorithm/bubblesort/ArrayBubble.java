package com.bdg.agharibyan.datastructuresandalgorithm.bubblesort;

public class ArrayBubble {

    private int nElements;
    private long[] array;

    public ArrayBubble(int max){
        nElements = 0;
        array = new long[max];
    }

    public void insert(long a){
        array[nElements] = a;
        nElements++;
    }

    public boolean find(long searchElement){
        int i;
        for(i = 0; i < nElements; i++){
            if(array[i] == searchElement){
                break;
            }
        }
        if(i == nElements){
            return false;
        } else{
            return true;
        }
    }

    public boolean remove(long removedElement){
        int i;
        for(i = 0; i < nElements; i++){
            if(array[i] == removedElement){
                break;
            }
        }
        if(i == nElements){
            return false;
        } else{
            for(int k = i; k < nElements-1; k++){
                array[k] = array[k+1];
            }
            nElements--;
            return true;
        }
    }

    public void display(){
        for(int i = 0; i < nElements; i++) {
            System.out.print (array[i] + " ");
        }
    }

    public void bubbleSort(){
        for(int k = 1; k < nElements; k++) {
            for ( int i = 0; i < nElements - k; i++) {
                if (array[i] > array[i + 1]) {
                    long x = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = x;
                }
            }
        }
    }
}
