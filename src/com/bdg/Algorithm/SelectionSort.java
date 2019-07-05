package com.bdg.Algorithm;

public class SelectionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n;i++){
            int smallest = i;
            for(int j =i+1; j<n;j++){
                if(arr[j]< arr[smallest]) {
                    smallest = j;
                }

                int smallestNumber = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = smallestNumber;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {20,50,40,80};
        SelectionSort obj = new SelectionSort();
        obj.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }

    }
}
