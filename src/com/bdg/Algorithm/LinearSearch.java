package com.bdg.Algorithm;

public class LinearSearch {

    public static  int search(int arr[], int x){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int arr[] = {10,20,30,40,50};
       int x = 200;

       int result = search(arr,x);
       if(result == -1){
           System.out.println("there is no index");
       }else{
           System.out.println("The index is" + " " + x);
       }

    }
}
