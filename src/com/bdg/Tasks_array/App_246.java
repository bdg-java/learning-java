package com.bdg.Tasks_array;

public class App_246 {
    public static void main(String[] args) {
        int intArray [] = {8,12,27,4,5,8,5,2,4};

        int sum = 0;

        for (int i = 0; i <intArray.length ; i++) {

            if(Math.sqrt(i) == 0 ){
                sum +=intArray[i];

            }
        }
        System.out.println(sum);

    }
}
