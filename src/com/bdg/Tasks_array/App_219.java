package com.bdg.Tasks_array;

public class App_219 {
    public static void main(String[] args) {
        int k =45;
        int sum = 0;
        int arr [] = {9,8,7,6,5,4};
        for(int i=0;i< arr.length; i++){
            if(k%arr[i] ==0){
                sum ++;
            }
        }
        System.out.println(sum);
    }
}
