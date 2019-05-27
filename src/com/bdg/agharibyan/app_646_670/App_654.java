package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_654 {
    public static void main(String[] args) {

        int n = 7;
        char[] array = new char[]{'0', 'A', 'z', 'a', '0', 'o', 'a'};

        int qanak = 0;

        for(int i = 0; i < n; i++){
            if(array[i] == 'a'){
                qanak++;
            }
        }

        char[] newarray = new char [n - qanak];
        int k = 0;

        for(int i = 0; i < n; i++){
            if(array[i] != 'a'){
                newarray[k] = array[i];
                k++;
            }
        }
        System.out.print(Arrays.toString(newarray));
    }
}
