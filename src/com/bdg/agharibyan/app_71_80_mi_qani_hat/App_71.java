package com.bdg.agharibyan.app_71_80_mi_qani_hat;

/**
 * @author Ani Gharibyan
 */
public class App_71 {
    public static void main (String[]args){

        //unem harc, te inchu enq tangens hashvelu patcharov stipvats grum double ev dra patcharov
        // 2.4-in mi qani angam 0.2-ner gumarelov stanum

        double x = 2.4;
        double y = 1.8;

        while (x <= 7.6) {
            y = Math.tan(2*x+x*x);
            System.out.println(x+","+y);
            x = x + 0.2;
        }

        for ( x = 2.4; x <= 7.6; x = x + 0.2){
            y = Math.tan(2*x+x*x);
            System.out.println(x+","+y);
        }
    }
}
