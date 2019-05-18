package com.bdg.Tasks_array;

public class App_234 {
    public static void main(String[] args) {
        int intArray [] = {2,1,5,7,4};


        int count = 0;
        for (int i = 0; i <intArray.length ; i++) {
            if(intArray[i]%2 == 1){
                count += intArray[i];
            }
        }
        System.out.println(count/2);
    }
}
