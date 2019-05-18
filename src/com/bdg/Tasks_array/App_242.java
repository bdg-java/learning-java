package com.bdg.Tasks_array;

public class App_242 {
    public static void main(String[] args) {
        int m = 2;
        int intArray [] = {8,2,4,5};

        int count = 0;

        for (int i = 0; i <intArray.length ; i++) {

            if(intArray[i]%m == 0 ){

                count *= intArray[i];

            }
        }
        System.out.println(count);
    }
}
