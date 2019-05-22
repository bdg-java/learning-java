package com.bdg.LessonString;

public class App_275 {
    public static void main(String[] args) {
        int cout =0;
        char na [] = {'o','k','n','a','b','c'};
        for(int i =0; i< na.length;i++){
            if(na[i] <'k'){
                cout += i;
            }
        }
        System.out.println(cout);


    }
}
