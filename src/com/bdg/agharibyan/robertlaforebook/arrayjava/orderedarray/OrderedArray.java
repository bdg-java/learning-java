package com.bdg.agharibyan.robertlaforebook.arrayjava.orderedarray;

public class OrderedArray {

    private long[] array;
    private int nElements;

    public OrderedArray(int max){
        array = new long[max];
        nElements = 0;
    }

    public int size(){
        return nElements;
    }

    public int find(long searchKey){
        int lowerBound = 0;
        int upperBound = nElements - 1;
        int currentIndex;

        while (true){
            currentIndex = (lowerBound + upperBound)/2;
            if(array[currentIndex] == searchKey){
                return currentIndex;
            } else if( lowerBound > upperBound){
                return nElements;
            } else {
                if(array[currentIndex] > searchKey){
                    upperBound = currentIndex - 1;
                } else{
                    lowerBound = currentIndex + 1;
                }
            }
        }
    }


    public void insert(long value){
        int j;
        for(j = 0; j < nElements; j++){
            if(array[j] > value){
                break;
            }
        }

//        for(int k = j+1; k <= nElements; k++){     //1.
//            array[k] = array[k-1];
//        }


        for(int k = nElements; k > j; k--){          //2.
            array[k] = array[k-1];
        }

        array[j] = value;
        nElements++;
    }

    public boolean delete(long value){
        int j = find(value);
        if(j == nElements){
            return false;
        } else{
            for(int k = j; k < nElements; k++){
                array[k] = array[k+1];
            }
            nElements--;
            return true;
        }
    }

    public void display(){
        for(int i = 0; i < nElements; i++){
            System.out.print(array[i] + " ");
        }
    }
}
