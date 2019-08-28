package com.bdg.repeating;

public class App_277 {
    public static void main(String[] args) {
        char arr[] = {'a', 'z', 'b', 'd', 'c', 'f','d','c' };
        int count = 0;
        int n = arr.length;
        for(int i=0; i <n; i++){
            if(arr[i] != 'd'){
                char []arr1 = new char[]{arr[i]};
                for(int j= 0;j<arr1.length; j++){
                    System.out.println(arr1[j]);
                }
            }
        }
    }
}
