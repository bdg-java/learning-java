package com.bdg.Tasks_array;

public class App_243 {
    public static void main(String[] args) {
        int t = 2;
        int intArray [] = {8,2,4,5};

        int count = 0;

        for (int i = 0; i <intArray.length ; i++) {

            if(intArray[i]%t == 0 ){

                count =count +1;

            }
        }
        System.out.println(count);
    }
}
