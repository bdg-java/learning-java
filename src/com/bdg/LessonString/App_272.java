package com.bdg.LessonString;

public class App_272 {
    public static void main(String[] args) {
        int cout = 0;
        int n = 5;
        boolean t = false;
        char na [] = {'a','b','c','d','e','a'};

        for(int i=0; i<na.length;i++){
            int calc = n/2;
            if(na[i] == 'b') {
                cout++;
                if(calc <=cout) {
                t = true;
                }
            }
        }
     System.out.println(t);
    }
}
