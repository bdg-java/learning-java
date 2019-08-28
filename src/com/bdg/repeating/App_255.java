package com.bdg.repeating;

public class App_255 {
    public static void main(String[] args) {
        int arr[] = {10,20,50,-40,10,80,55,1};
        int max = arr[0];
        int temp;
        int index =0;

        for(int i= 0; i<arr.length;i++){
            if(arr[i]>= max){
                max= arr[i];
                index= i;
            }
        }
        System.out.println(max);
    }
}
