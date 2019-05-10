package com.bdg.AHakobyan;

public class App_40 {
    public static void main(String []args){

        int a = 20;
        int b = 15;
        int c = 10;
        int d = 5;

        if (a > b && a > c && a > d){
            System.out.print(a + "" + b + "" + c + "" +d);
        }else if (b > a && b > c && b > d){
            System.out.print(b + "" + a + "" + c +"" +d);
        }else if (c > a && c > b && c > d) {
            System.out.print(c + "" + a + "" + b + "" +d);
        }else if (d > a && d > b && d > c)
            System.out.print(d + "" + a + "" + b + "" +c );
    }
}
