package com.bdg.agharibyan.app_271_280;

public class App_271_272_273 {

    public static void main(String [] args){

        int n = 5;
        char [] x = new char []{'s', 'b', '%', 'a', 's'};
        int qanak_a = 0;

        for ( int i = 0; i < n; i++ ){
                if (x[i] == 'a'){
                    qanak_a ++;
                }
            }
        System.out.println("a-i qanak:"+qanak_a);

        boolean t = false;
        int qanak_b = 0;

        for ( int i = 0; i < n; i++ ){
            if (x[i] == 'b'){
                qanak_b ++;
            }
        }
        if (qanak_b >= n/2){
            t = true;
        }
        System.out.println("b-i qanaki stugum:"+t);

        int s_indexneri_gumar = 0;

        for ( int i = 0; i < n; i++ ){
            if (x[i] == 's'){
                s_indexneri_gumar += i;
            }
        }
        System.out.println("s_indexneri_gumar:"+s_indexneri_gumar);
    }
}