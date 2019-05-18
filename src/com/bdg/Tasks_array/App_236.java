package com.bdg.Tasks_array;

public class App_236 {
    public static void main(String[] args) {
        int intArray [] = {2,1,5,7,4};


        int count = 0;
        int sum = 1;
        for (int i = 0; i <intArray.length ; i++) {
            if(intArray[i]%2 == 1){
                sum *= intArray[i];
                count += 1;
            }
        }
        System.out.println(count+","+sum);
    }
}
