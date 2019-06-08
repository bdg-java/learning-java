package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_661 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char []{'d', 'A', 'c', 'v', '0', 'v', 'd'};

        int indexFirstv = 0;

        for(int i = 0; i < n; i++){
            if(array[i] == 'v'){
                indexFirstv = i;
                break;
            }
        }

        char [] newarray = new char [indexFirstv + 1];

        for(int i = 0; i < indexFirstv + 1; i++){
            newarray[i] = array[i];
        }
        System.out.print(Arrays.toString(newarray));
    }
}
