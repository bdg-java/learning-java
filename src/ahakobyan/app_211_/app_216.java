package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_216 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        double a = 1;
        int i;

        for (i = 0; i < x.length; i++){
            if ((i & 1) == 0){
                a = a *x[i];
            }
        }
        System.out.println(a);
    }
}
