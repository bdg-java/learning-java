package com.bdg.AGharibyan.App_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_64 {
    public static void main(String[] args) {

        int a = 1214;
        char y = 's';
        int mt = a%10 + a%100/10;

//        if&else
//        if ( mt == 5 ){
//            y = 's';
//        } else {
//            y = 'd';
//        }
//        System.out.println(y);

//        switch&case
//        switch (mt){
//            case 5:
//                y = 's';
//                break;
//            default:
//                y = 'd';
//        }
//        System.out.println(y);

        y = mt == 5 ? 's': 'd';
        System.out.println(y);
    }
}
