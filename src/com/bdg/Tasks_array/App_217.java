package com.bdg.Tasks_array;

public class App_217 {
    public static void main(String[] args) {
        int sum = 1;
        int intArray [] = {1,2,3,4};

        for(int i =0; i< intArray.length; i++){
            if(i%2 == 1 ) {
               int b = (int) Math.pow(i,2);
               sum *=b;
            }
        }
        System.out.println(sum);
    }

}
