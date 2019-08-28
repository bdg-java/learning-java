package com.bdg.repeating;

public class App_291 {
    public static void main(String[] args) {
        int arr [] = {1,5,10,15,25,-1,-5,-10,-15,-25};
        int n= arr.length;

        for(int i= 0;i<n;i++){
            if(arr[i]<0){
                int []arr1 = new int[]{arr[i]};
                for(int j= 0; j<arr1.length;j++){
                    System.out.println(arr1[j]);
                }
            }
        }
    }
}
