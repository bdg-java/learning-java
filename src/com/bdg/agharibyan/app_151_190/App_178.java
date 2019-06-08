package com.bdg.agharibyan.app_151_190;

import java.util.Arrays;

public class App_178 {
    public static void main(String[] args) {

        int n = 8;
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;

        int [] array = new int [n];
        array[0] = x1;
        array[1] = x2;
        array[2] = x3;

        for(int i = 3; i < n; i++){
            array[i] = array[i-1] + array[i-2] - 2*array[i-3];
        }
        System.out.print(Arrays.toString(array));
    }
}
