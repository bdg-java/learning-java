package com.bdg.LessonString;

public class App_271 {
    public static void main(String[] args) {
        int cout = 0;
        int n = 5;
        char na [] = {'a','b','c','d','e','a'};

        for(int i=0; i<na.length;i++){
            if(na[i] == 'a') {
                cout++;
            }
        }
        System.out.println (cout);
    }
}
