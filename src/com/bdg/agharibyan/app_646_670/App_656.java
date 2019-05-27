package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_656 {
    public static void main(String[] args) {

        int n = 7;
        char[] array = new char[]{'x', 'A', 'x', 'a', '0', 'o', 'x'};

        int qanak = 0;
        for(int i = 0; i < n; i++){
            if(array[i] == 'x'){
                qanak++;
            }
        }

        char [] newarray = new char[n + qanak];
        int k = 0;

        for(int i = 0; i < n; i++){
            if(array[i] == 'x'){
                newarray[k] = 'y';
                newarray[k+1] = 'y';
                k += 2;
            } else {
                newarray[k] = array[i];
                k++;
            }
        }
        System.out.print(Arrays.toString(newarray));
    }
}
