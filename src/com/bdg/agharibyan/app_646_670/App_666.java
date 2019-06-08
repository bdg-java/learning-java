package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_666 {
    public static void main(String[] args) {

        int n = 4;
        char [] array = new char []{'a', 'b', 'c', '1', '2', '3', 'd', 'e', 'f'};

        char [] newArray = new char [array.length - 3];
        int k = 0;
        int j = 0;

        for(int i = 0; i < array.length - 3; i++){
            if(i < array.length/2 - 1){
                newArray[i] = array[k];
                k++;
            }
            else{
                newArray[i] = array[array.length/2 + 2 + j];
                j++;
            }
        }
        System.out.print(Arrays.toString(newArray));
    }
}
