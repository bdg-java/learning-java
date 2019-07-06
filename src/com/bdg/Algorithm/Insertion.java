package com.bdg.Algorithm;

public class Insertion {
     public void sort(int arr[]){
         int n = arr.length;
         for(int i =1; i<n; i++){
            int x = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>x){
                arr[j+1]=arr[j];
                j = j-1;
            }
            arr[j+1] = x;
         }
     }

    public static void main(String[] args) {
        Insertion sortable = new Insertion();
        int arr[] = {1,3,5,4,2};
        sortable.sort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ ",");
        }
    }
}
