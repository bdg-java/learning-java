package com.bdg.Tasks_array;

public class App_237 {
    public static void main(String[] args) {
        int intArray [] = {2,1,5,0,0,7,4};


        int count = 0;

        for (int i = 0; i <intArray.length ; i++) {
            if(intArray[i] == 0){

                count += 1;
            }
        }
        System.out.println(count);
    }
}
