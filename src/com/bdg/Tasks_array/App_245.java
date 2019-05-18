package com.bdg.Tasks_array;

public class App_245 {
    public static void main(String[] args) {
        int intArray [] = {8,12,27,4,5};

        int sum = 0;

        for (int i = 0; i <intArray.length ; i++) {
           int sums = intArray[i]+ i;
            if(sums%3 == 0 ){
                sum += Math.pow(intArray[i],2);

            }
        }
        System.out.println(sum);

    }
}
