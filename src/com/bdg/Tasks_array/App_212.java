package com.bdg.Tasks_array;

public class App_212 {
    public static void main(String[] args) {

        int[] arr = {4,-10,12,14};
        int sum = 0;
        int cout = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                sum = (int)Math.pow(arr[i],2);
                cout++;
            }
        }

        System.out.println(sum/cout);

    }
}
