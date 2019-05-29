package com.bdg.exercises_646_670;

import com.bdg.exercises_271_280.CharOperations;

public class App_646 {
    public static void main(String[] args) {
        int n =24;
        int count = 0;
        char[] chars = CharOperations.arrayWithGivenSize(n);
        for (int i=0;i<n;i++){
            System.out.println(chars[i]);
            if(chars[i] == 'a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
