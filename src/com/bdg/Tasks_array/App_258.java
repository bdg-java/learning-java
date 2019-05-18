package com.bdg.Tasks_array;

public class App_258 {
    public static void main(String[] args) {
        int intarray [] = {0, -20, 25, 3, 96, 57};
        int max = intarray[0];
        int count = 0;
        for (int i = 1; i < intarray.length-1; i++) {
            if (intarray[i]-- > max) {
                max = intarray[i];
                count = i;

            }
        }
        System.out.println(count);
    }
}
