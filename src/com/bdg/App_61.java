package com.bdg;

public class App_61 {
    public static void main(String[] args) {
        boolean t = true;
        int a = 1634;

        int c_one = a % 100/10;
        int b_one = a % 1000/100;
        int a_one = a/1000;
        int d_one = a%10;

//        System.out.println(a_one+","+b_one+","+c_one+","+d_one);

        int tac = (a_one + b_one);
        int ta = (c_one + d_one);


        if(tac == ta ){
            t = true;
        }else{
            t = false;
        }
        System.out.println(t);

    }
}
