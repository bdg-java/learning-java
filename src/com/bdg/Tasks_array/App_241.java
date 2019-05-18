package com.bdg.Tasks_array;

public class App_241 {
    public static void main(String[] args) {
        int k = 2;
        int intArray [] = {8,2,4,5};

        int count = 0;

        for (int i = 0; i <intArray.length ; i++) {

            if(intArray[i]%k == 0 ){

                count += intArray[i];

            }
        }
        System.out.println(count);
    }

}
