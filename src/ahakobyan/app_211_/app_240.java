package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_240 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        int a =0;
        int i;

        for (i =0; i<=x.length; i++)
            if (x[i] %7 == 0){
                a++;
            }
        System.out.println(a);
    }
}
