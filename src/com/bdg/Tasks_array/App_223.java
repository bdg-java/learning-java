package com.bdg.Tasks_array;

public class App_223 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int intArray [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,};

        int sum = 1;
        int count = 0;
        for (int i = a; i <= b; i++) {
            sum *= intArray[i] ;
            count += 1;
        }
        System.out.println(count);

    }
}
