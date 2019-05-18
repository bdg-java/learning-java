package com.bdg.Tasks_array;

public class App_228 {
    public static void main(String[] args) {
        int k = 5;
        int intArray [] = {1,2,3,4,5,6,7,8,9,10,45};

        int sum = 1;
        for (int i = 0; i <intArray.length; i++) {
            if(i%k==0){
                sum += intArray[i];
            }
        }
        System.out.println(sum);

    }
}
