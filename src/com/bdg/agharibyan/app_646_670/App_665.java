package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_665 {
    public static void main(String[] args) {

        int n = 3;
        int m = 5;

        char [] array1 = new char []{'a', 'b', 'c', 'd', 'e', 'f'};
        char [] array2 = new char []{'1', '2', '3', '4', '5'};

        char [] newArray = new char [2*n + m];
        int j = 0;
        int k = 0;

        for(int i = 0; i < 2*n + m; i++){
            if(i < n){
                newArray[i] = array1[i];
            }
            if(i >= n && i < n + m){
                newArray[i] = array2[j];
                j++;
            }
            if(i >= n + m){
                newArray[i] = array1[n+k];
                k++;
            }
        }
        System.out.print(Arrays.toString(newArray));
    }
}
