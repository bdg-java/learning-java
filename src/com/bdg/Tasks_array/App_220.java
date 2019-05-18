package com.bdg.Tasks_array;

public class App_220 {
    public static void main(String[] args) {
        int arr [] = {9,8,7,6,5,4};
        int even = 0;
        int odd = 0;
        for(int i=0;i< arr.length; i++){
           if(arr[i]%2 == 0 ){
               even = even + 1;
           }else{
               odd+=1;
           }
        }
        System.out.println(even+","+odd);


    }
}
