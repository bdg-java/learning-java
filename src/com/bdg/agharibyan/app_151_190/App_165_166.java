package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_165_166 {
    public static void main(String[]args){

        boolean t = true;
        int n = 3;

        for (int i = 3; i <= n ; i = i * i){
            if ( i == n ) {
                t = true;
            } else {
                t = false;
            }
        }
        if ( n == 0 || n ==1 || n ==2 ){
            t = false;
        }
        System.out.println(t);

// App_166

        int y = -1;
        int n2 = 4;

        for ( int i = 4; i <= n2; i = i * i ){
            if ( i == n2 ){
                y = 1;
            } else {
                y = 0;
            }
        }
        if ( n2 == 0 || n2 == 1 || n2 == 2 || n2 == 3){
            y = 0;
        }
        System.out.print(y);
    }
}
