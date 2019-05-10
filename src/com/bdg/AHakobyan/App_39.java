package com.bdg.AHakobyan;

public class App_39 {
    public static void main(String []args) {

        int a = 20, b = 15, c = 10, d = 5;

        if (a<b && a<c && a<d && b<c && c<d ) {
            System.out.print(a + "" + b + "" + c + "" +d);
        }else if (b<a && b<c && b<d && a<c && c<d) {
            System.out.print(b + "" + a + "" + c + "" +d );
        }else if (c<a && c<b && c<d && a<b && b<d) {
            System.out.print(c + "" + a + "" + b + "" +d);
        }else if (d<a && d<b && d<c && c<b && b<a)
            System.out.print(d + "" + c + "" + b + "" +a);
    }
}
