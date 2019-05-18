package com.bdg.Tasks_array;

public class App_211 {
    public static void main(String[] args) {

        int[] arr = {4,-10,12,14};
        int sum = 0;
        int cout = 0;

            for(int i = 0; i < arr.length; i++) {
                if(arr[i]>0){
                    sum = sum + arr[i];
                    cout = cout + 1;

                }
        }
        System.out.println(sum/cout);


    }
}
