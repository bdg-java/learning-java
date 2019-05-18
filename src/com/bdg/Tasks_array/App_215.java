package com.bdg.Tasks_array;

public class App_215 {
    public static void main(String[] args) {
        int sum = 0;
      int intArray [] = {1,2,3,4,2};

        for(int i =0; i<intArray.length; i++){
            if(i%2 ==0) {
                sum = sum + i;
            }
           // System.out.println(intArray[i]);
        }
        System.out.println(sum);
    }

}
