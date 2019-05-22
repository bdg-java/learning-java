package com.bdg.Tutorial;

public class CopySumArray {
    public static void main(String args[]) {
        int arr []= {1,2,3,4};
        // passing array to method m1
        sum(arr);
    }
    public static void sum(int arr[]){
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            sum+=i;
            System.out.println(sum);
        }
    }
}
