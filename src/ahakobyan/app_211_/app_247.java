package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_247 {
    public static void main(String[] args) {

        int[] x = IntegerArrayoperations.getDefaultArray();
        int a = 1;
        int i;

        for (i = 0; i < x.length; i++)
            if (i < x[i]){
                a = x[i] * x [i];
            }
        System.out.println(a/x.length);
    }
}
