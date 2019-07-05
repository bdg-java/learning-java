package com.bdg.Algorithm;

public class BinarySearch {
    public static void  search(int arr[], int first, int last, int x){
        int mid = (first+last)/2;
        while(first<=last){
            if(arr[mid]>x){
                first = last+1;
            }
            else if(arr[mid] == x){
                System.out.println("the index is "+ x);
                break;
            }else{
                last = mid-1;
            }
//            if(arr[mid]<x){
//                last = mid-1;
//            }
            mid = (first+last)/2;
        }
        if(first> last){
            System.out.println("not ok");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,};
        int x = 3;
        int last = arr.length-1;

        search(arr,0,last,x);
    }
}
