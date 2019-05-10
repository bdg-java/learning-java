package com.bdg;

public class App_55 {

    public static void main(String[] args) {
        int all = 568;

        int a = all/100;
        int b = all%100/10;
        int c = all%10;

        System.out.println(a+","+b+","+c);

        if(a < b && a<c){
            System.out.println(a);
        }else if(b < a && b<c ){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }

}
