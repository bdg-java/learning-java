package com.bdg.pastreapeat;

public class App_188 {
    public static void isFibonacci(int number){
        int []array  = new int[20];
        array[0] = 1;
        array [1] = 1;
        for (int i = 0; i <array.length ; i++) {
            if (i>=2) {
                array[i] = array[i - 2] + array[i - 1];
            }
            System.out.println(array[i]);
            if (number == array[i]){
                System.out.println(true);
                break;
            }
        }

    }
    public static void main(String[] args) {
        isFibonacci(40);
        
    }
}
