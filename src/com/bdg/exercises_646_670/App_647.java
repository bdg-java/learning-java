package com.bdg.exercises_646_670;

import java.util.Arrays;

public class App_647 {

    public static void main(String[] args) {
        char[] chars = {'a','n','n','s'};
        char[]  newChar = new char[chars.length];
        boolean t=false;
        for (int i =chars.length-1;i>=0;i--){
            newChar[i] = chars[i];
        }
        System.out.println(chars);
        System.out.println(newChar);
        if(Arrays.equals(chars,newChar)){
            t = true;
        }
        System.out.println(t);
    }

}
