package com.bdg.nhakobyan.lesson_2;

public class App_30 {

    public static void main(String[] args) {

        int a = -1;
        int b = 9;
        int c = 100;

    /*    if (a > b) {
            if (b > c) {
                System.out.println(a +","+ b +","+ c);
            } else {
                if (a > c) {
                    System.out.println(a +","+ c +","+ b);
                } else {
                    System.out.println(c +","+ a +","+ b);
                }
            }
        } else {
            if (a > c) {
                System.out.println(b +","+ a +","+ c);
            } else {
                if (b > c) {
                    System.out.println(b +","+ c +","+ a);
                } else {
                    System.out.println(c +","+ b +","+ a);
                }
            }
        }
     */

        if ( a > b && b > c){
            System.out.println(a +","+ b +","+ c);
        }
        if ( a > b && c > b && a > c ){
            System.out.println(a +","+ c +","+ b);
        }
        if ( b > a && a > c){
            System.out.println(b +","+ a +","+ c);
        }
        if ( b > a && c > a && b > c ){
            System.out.println(b +","+ c +","+ a);
        }
        if ( c > a && a > b){
            System.out.println(c +","+ a +","+ b);
        }
        if ( c > a && b > a && c > b ){
            System.out.println(c +","+ b +","+ a);
        }
    }
}
