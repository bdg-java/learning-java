package com.bdg.Tasks_array;

public class App_250 {
    public static void main(String[] args) {
        int intArray [] = {8,2,4,5,-5};

        int sum = 1;

        for (int i = 1; i <intArray.length ; i++) {
            int arjeq = intArray[i] * i;
            if(arjeq%3 ==2){
                double a = Math.pow(arjeq,2);
                sum *= a;
            }
        }
        System.out.println(sum);
    }
}
