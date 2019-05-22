package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_241 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        int a = 0;
        int k = 4;
        int i;

        for (i = 0; i <= x.length; i++)
            if (x[i] % k == 0){
                a = a+ x[i];
            }
        System.out.println(a);
    }
}
