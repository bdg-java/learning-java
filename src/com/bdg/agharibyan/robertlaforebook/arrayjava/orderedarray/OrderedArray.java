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
    //        System.out.println("lowerbound " + lowerBound + " upperbound " + upperBound + " stugvogh currentIndex " + currentIndex);  //stugman yntacqy nayelu hamar em grel
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


    public void insert(long value){                 //mutq enq anum arrayi mej vazelu tarberakov
        int j;
        for(j = 0; j < nElements; j++){
            if(array[j] > value){
                break;
            }
        }

//        for(int k = j+1; k <= nElements; k++){     //1. hajord tvyaly chem pahum, dra hamar chi chisht ashkhatum?
//            array[k] = array[k-1];
//        }

        for(int k = nElements; k > j; k--){          //2. idealakan ashhatum e
            array[k] = array[k-1];
        }

        array[j] = value;
        nElements++;
    }

//    public void insert(long value){              //mutq enq anum kiselu tarberakov, sakayn khndir unem amenaarajin andami mutqagrman het..uzum em nayenq Williami het(
//
//        int lowerBound = 0;
//        int upperBound = nElements-1;
//        int currentIndex;
//        int j;
//        for(j = lowerBound; j <= upperBound; j++){
//            currentIndex = (lowerBound + upperBound)/2;
//            if(array[currentIndex] > value){
//                upperBound = currentIndex - 1;
//            } else{
//                lowerBound = currentIndex + 1;
//            }
//        }
//
//        for(int k = nElements; k > j; k--){
//            array[k] = array[k-1];
//        }
//        array[j] = value;
//        nElements++;
//    }

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

    public static boolean merge(OrderedArray firstArray,OrderedArray secondArray){           //chem tesnum ardyunq kam chi ashkhatum(
        OrderedArray mergedArray = new OrderedArray(firstArray.size()+ secondArray.size());
        int indexFirstArray = 0;
        int indexSecondArray = 0;

        if(firstArray.array[indexFirstArray] < secondArray.array[indexSecondArray]){
            mergedArray.insert(firstArray.array[indexFirstArray]);
            indexFirstArray++;
            while(true) {
                if (firstArray.array[indexFirstArray] < secondArray.array[indexSecondArray]) {
                    mergedArray.insert(firstArray.array[indexFirstArray]);
                    indexFirstArray++;
                }
                if(indexFirstArray == firstArray.size()-1){
                    break;
                }
            }
        } else{
            mergedArray.insert(secondArray.array[indexSecondArray]);
            indexSecondArray++;
            while(true){
                if(secondArray.array[indexSecondArray] < firstArray.array[indexFirstArray]){
                    mergedArray.insert(secondArray.array[indexSecondArray]);
                    indexSecondArray++;
                }
                if(indexSecondArray == secondArray.size()-1){
                    break;
                }
            }
        }

        if(firstArray.size() > secondArray.size()){
            mergedArray.insert(firstArray.array[indexFirstArray]);
            indexFirstArray++;
        } else{
            mergedArray.insert(secondArray.array[indexSecondArray]);
            indexSecondArray++;
        }
        mergedArray.display();
        return true;
    }


}
