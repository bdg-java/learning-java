package com.bdg.agharibyan.datastructuresandalgorithm.selectsort;

public class ArraySelect {

    private long[] array;
    private int nElements;

    public ArraySelect(int maxSize){
        nElements = 0;
        array = new long[maxSize];
    }

    public void insert(long value){
        array[nElements] = value;
        nElements++;
    }

    public void display(){
        for(int i = 0; i < nElements; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void selectSort(){
        for(int i = 0; i < nElements - 1; i ++) {
            int min = i;
            for (int k = i + 1; k < nElements; k++) {
                if (array[k] < array[min]) {
                    min = k;
                }
            }
            if(min != i) {                 //ays stugman kariqy ka? aragutyan tesankyunic aveli lav e lini stugum, te inqn ir het pokhi tegherov?
                long temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
