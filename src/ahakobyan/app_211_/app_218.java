package ahakobyan.app_211_;

import ahakobyan.IntegerArrayoperations;

public class app_218 {
    public static void main(String[] args) {

        int [] x= IntegerArrayoperations.getDefaultArray();
        int c = 0;
        int k =5;
        int i;

        for (i = 1; i < x.length; i++){
            if (k % i == 0 || k % i == 5 ){
                c++;
            }
        }
        System.out.println(c);
    }
}
