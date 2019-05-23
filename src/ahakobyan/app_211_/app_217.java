package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_217 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        double a = 1;
        int i;

        for (i=0; i < x.length; i++){
            if ((i &2) == 0) {
                a = a *(x[i] * x[i]);
            }
        }
        System.out.println(a);
    }
}
