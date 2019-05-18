package com.bdg.Tasks_array;

public class App_221 {
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        int intArray [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,};

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += intArray[i] ;
        }
        System.out.println(sum);

    }
}
