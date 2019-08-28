package com.bdg.repeating;

public class App_300 {
    public static void main(String[] args) {
        int arr [] = {1,5,10,15,25,-1,-5,-10,-15,-25};
        int n= arr.length;
        int k= 100;

        for(int i= 0;i<n;i++){
            if(Math.pow(arr[i],2) > k){
                int []arr1 = new int[]{arr[i]};
                for(int j= 0; j<arr1.length;j++){
                    System.out.println(arr1[j]);
                }
            }
        }
    }
}
