package com.bdg.Tasks_array;

public class App_248 {
    public static void main(String[] args) {
        int k = 2;
        int intArray [] = {8,2,4,5};

        int sum = 0;

        for (int i = 0; i <intArray.length ; i++) {
            int arjeq = intArray[i] + i;
           if(arjeq < intArray[i]){
               sum +=1;
           }
        }
        System.out.println(sum);
    }
}
