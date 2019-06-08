package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_668 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char []{'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        char [] newArray = new char [n - n/3];
        int k = 0;

        for(int i = 0; i < n; i++){
            if(i%3 != 0 || i == 0){
                newArray[k] = array[i];
                k++;
            }
        }
        System.out.print(Arrays.toString(newArray));
    }
}
