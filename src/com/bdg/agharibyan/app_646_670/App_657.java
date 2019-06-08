package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_657 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char[]{'x', 'A', 'x', 'a', '0', 'o', 'x'};

        int length = 0;
        int qanak = n/2;

        if(qanak%2 == 0){
            length = qanak;
        } else{
            length = qanak + 1;
        }

        char [] newarray = new char [length];
        int k = 0;

        for(int i = 0; i < n; i += 2){
            if(i != n -1 ){
                if(array[i] > array[i+1]){
                    newarray[k] = array[i];
                } else{
                    newarray[k] = array[i+1];
                }
                k++;
            } else{
                newarray[k] = array[i];
            }
        }
        System.out.print(Arrays.toString(newarray));

    }
}
