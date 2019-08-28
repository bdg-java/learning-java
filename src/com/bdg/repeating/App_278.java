package com.bdg.repeating;

public class App_278 {
    public static void main(String[] args) {
        char arr[] = {'a', 'z', 'b', 'd', 'c', 'f','d','c' };
        int count = 0;
        int n = arr.length;
        for(int i=0; i <n; i++){
            if(i%2 == 1){
                char arr2[] = new char[]{arr[i]};
                for(int j=0; j<arr2.length;j++ ){
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
