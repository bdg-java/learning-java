package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_658 {
    public static void main(String[] args) {

        int n = 4;
        char [] array = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        char [] newarray = new char [2*n];
        int k = 0;

        for(int i = 0; i < 2*n; i += 2){
            newarray[k] = array[i+1];
            newarray[k+1] = array[i];
            k += 2;
        }
        System.out.print(Arrays.toString(newarray));
    }
}
