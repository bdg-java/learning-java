package com.bdg.agharibyan.app_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_65 {
    public static void main ( String [] args){

        int a = 1214;
        int m = a%10;
        int t = a%100/10;

//        if ( m*t == 12 ){
//            System.out.println("'y=12'");
//        } else {
//            System.out.println("'y=0'");
//        }

        switch (m*t){
            case 12:
                System.out.println("'y=12'");
                break;
            default:
                System.out.println("'y=0'");
        }
    }
}
