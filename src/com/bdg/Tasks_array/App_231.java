package com.bdg.Tasks_array;

public class App_231 {
    public static void main(String[] args) {
        int intArray [] = {2,1,5,7,4};

        int sum = 0;
        for (int i = 0; i <intArray.length ; i++) {
            if(intArray[i]%2 == 0){
                sum += Math.pow(intArray[i],2);
            }
        }
        System.out.println(sum);
    }
}
