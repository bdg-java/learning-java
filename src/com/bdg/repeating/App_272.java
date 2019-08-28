package com.bdg.repeating;

public class App_272 {
    public static void main(String[] args) {
        char arr[] = {'a', 'z', 'b','b','b','b','b','b', 'd', 'c', 'f', };
        int count = 0;
        int n = arr.length;

        boolean t = false;

        for (int i =0; i<n;i++){
            if(arr[i] == 'b'){
                count++;
            }
        }

        if(count>=(n/2)){
            t= true;
        }

        System.out.println(t);
    }
}
