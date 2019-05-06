package com.bdg;

public class App_32 {
    public static void main(String[] args) {

        int a = 23;
        int b = 35;
        int c = 75;
        int d = 44;

        if (a < b && a < c && a < d ) {
            System.out.println("The minimum value is "+ a);
        }
        else if (b < a && b < c && b < d) {
            System.out.println("The minimum value is" + b);
        }
        else if (c < a && c < b && c < d ){
            System.out.println("The minimum value is "+c);
        }
        else if (d < a && d < b && d <c){
            System.out.println("The minimum value is "+d);
        }
    }
}
