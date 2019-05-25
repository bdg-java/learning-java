package com.bdg.Lesson5;

public class App_647 {
    public static void main(String[] args) {
        char n ;
        char m ;
        boolean x =false;
        char array [] = {'a','b', 'c', 'd','d','c','b','a'};
        int len = array.length;

        for(int i =0 ; i < len; i++){
            if(array[len-i-1] == array[i]){
                x = true;
            }
        }
        System.out.println(x);
    }
}
