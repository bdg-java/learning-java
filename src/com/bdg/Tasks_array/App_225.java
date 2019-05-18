package com.bdg.Tasks_array;

public class App_225 {
    public static void main(String[] args) {
        int t = 5;
        int intArray [] = {1,2,3,4,5,6,7,8,9,10};

        int sum = 1;
        int count = 0;
        for (int i = 0; i <intArray.length; i++) {
             if(intArray[i]<t){
                sum *= intArray[i];

             }
        }
        System.out.println(sum);

    }
}
