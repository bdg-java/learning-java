package com.bdg.Tasks_array;

public class App_249 {
    public static void main(String[] args) {
        int k = 2;
        int intArray [] = {8,2,4,5,-5};

        int sum = 0;

        for (int i = 1; i <intArray.length ; i++) {
            int arjeq = intArray[i] / i;
            if(Math.pow(arjeq,2)%k ==0){
                sum += intArray[i];
            }
        }
        System.out.println(sum);
    }
}
