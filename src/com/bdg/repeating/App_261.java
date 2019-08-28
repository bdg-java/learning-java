package com.bdg.repeating;

public class App_261 {
    public static void main(String[] args) {
        int arr [] = {1,5,70,8,4};
        int arr1 [] = {1,5,7,8,4};
        int sum =0;
        int count = 0;
        int count1 = 0;
        int sum1 =0;
        for(int i= 0;i<arr.length;i++){
            sum+= arr[i];
            count++;
            for(int j=0; j<arr1.length;j++){
                sum1+= arr[j];
                count1++;
            }
        }

       int res = (sum/count) * (sum1/count1);

        System.out.println(res);
    }
}
