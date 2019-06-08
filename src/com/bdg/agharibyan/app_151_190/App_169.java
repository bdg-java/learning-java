package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_169 {
    public static void main(String[]args){

        int x = 3;
        int y = 1;
        int z = -1;
        int xy = x + y;

        for ( int i = 2; i <= Math.sqrt(xy); i++){
            if (xy%i == 0){
                z = 6;
            } else {
                z = 5;
            }
        }
        if ( (x == 1 && y == 2) || (x == 2 && y ==1)){
            z = 5;
        }
        System.out.print(z);
    }
}
