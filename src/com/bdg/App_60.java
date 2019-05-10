package com.bdg;

public class App_60 {
    public static void main(String[] args) {
        int all = 657;

        int a = all/100;
        int b = all%100/10;
        int c = all%10;

        if(a > b && b > c && a > c ){
            System.out.println(a+","+b+","+c);
        }else if(a > b && a > c && c > b ){
            System.out.println(a+","+c+","+b);
        }else if(b > a && a > c && b >c){
            System.out.println(b+","+a+","+c);
        }else if(b > a && c > a &&  b > c){
            System.out.println(b+","+c+","+a);
        }else if(c > a && a > b && c > b){
            System.out.println(c+","+a+","+b);
        }else{
            System.out.println(c+","+b+","+a);
        }




    }
}
