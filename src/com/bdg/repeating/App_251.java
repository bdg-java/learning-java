package com.bdg.repeating;

public class App_251 {
    public static void main(String[] args) {
        int arr[] = {10,20,50,-40,10,80,55,1};
        int max;
        int temp;
        for(int i = 0; i<arr.length;i++){
           for(int j=0; j<arr.length;j++){
               if(arr[i]<arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        max= arr[0];
        System.out.println(max);
    }
}
