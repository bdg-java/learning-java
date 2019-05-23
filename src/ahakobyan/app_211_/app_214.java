package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_214 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        double a =0;
        int i;

        for (i=1; i< x.length; i++){
            if (x[i] <0){
                a =a + x[i];
            }
        }
        System.out.println(a/x.length);
    }
}
