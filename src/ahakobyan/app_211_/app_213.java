package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_213 {
    public static void main(String[] args) {

        int [] x = IntegerArrayoperations.getDefaultArray();
        double a = 1;
        int i;

        for (i = 1; i<x.length; i++){
            if (x[i] < 0){
                a +=x[i] * x[i];
            }
        }
        a = Math.sqrt(a/i);
        System.out.println(a);
    }
}
