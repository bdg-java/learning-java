package com.bdg;

public class App_58 {
    public static void main(String[] args) {
        int all =897;

        int x = all/100;
        int y = all%100/10;
        int c = all%10;

        char f = 'a';

        if((x + y) < 5){
            System.out.println(f);
        }else{
             f = 'b';
            System.out.println(f);
        }
    }
}
