package com.bdg.Tasks_array;

public class App_244 {
    public static void main(String[] args) {
        int intArray [] = {8,12,27,4,5};

        int sum = 1;

        for (int i = 0; i <intArray.length ; i++) {

            if(intArray[i]%5 == 2 ){

              sum *= intArray[i];

            }
        }
        System.out.println(sum);
    }
}
