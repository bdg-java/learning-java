package com.bdg.agharibyan.app_71_80_mi_qani_hat;

/**
 * @author Ani Gharibyan
 */
public class App_72 {
    public static void main (String [] args){

        double y = 0.3;

        for ( double x = -5.4; x <= 1.2; x += 0.4 ){
            y = (1.0/Math.tan(x*x))*(1.0/Math.tan(x*x));
            System.out.println(x+","+y);
        }

        //unem harc, te ardyunqum x-i arzheqnern inchu en -5.4, -5, -4.6, -4.199999??? che vor ughigh 0.4ov e achum?
    }
}
