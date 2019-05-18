package com.bdg.Tasks_array;

public class App_240 {
    public static void main(String[] args) {
        int intArray [] = {22,1,5,77,4,81,9};

        int count = 0;

        for (int i = 0; i <intArray.length ; i++) {

            if(intArray[i]%3 == 0 ){

            count += 1;

            }
        }
        System.out.println(count);
    }
}
