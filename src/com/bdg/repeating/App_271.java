package com.bdg.repeating;

public class App_271 {
    public static void main(String[] args) {
        char arr[] = {'a','z','b','d', 'c','f','e','w','a','c'};
        int count = 0;
         for(int i= 0; i<arr.length; i++){
             if(arr[i] == 'a'){
                 count++;
             }
         }
        System.out.println(count);
    }
}
