package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_238 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        int a =0;
        int i;

        for (i =0; i< x.length; i++)
            if (x[i] % 3 == 0 ){
                a = a + x[i];
            }
        System.out.println(a);
    }
}