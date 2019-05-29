package com.bdg.exercises_646_670;

public class App_650 {
    public static void main(String[] args) {
        char[] firstChar = {'a','b','d','z','p'};
        char[] secondChar = {'a','g','u','o','z'};
        int count =0;
        for (int i=0;i<firstChar.length;i++){
            for (int j=0;j<secondChar.length;j++){
                if(firstChar[i] == secondChar[j]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
