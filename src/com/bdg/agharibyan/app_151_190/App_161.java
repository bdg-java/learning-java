package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_161 {
    public static void main(String[]args){

        int min = 1;

//        for ( int i = 9999; i>=1000; i--){
//            if (Math.sqrt(i*26)%2==0){
//                min = i;
//            }
//        }
//        System.out.println(min);

        for ( int h = 1000; h <= 9999; h++){
            if (Math.sqrt(h*26)%2==0){
                min = h;
                break;
            }
        }
        System.out.println(min);
    }
}
