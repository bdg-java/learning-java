package com.bdg.Tasks_array;

public class App_216 {
    public static void main(String[] args) {
        int sum = 1;
        int intArray [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i =0; i<intArray.length; i++){
            if(i%2 == 0) {
                sum = sum * i;
            }
        }
        System.out.println(sum);
    }

}
