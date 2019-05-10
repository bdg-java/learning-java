package com.bdg;

public class App_57 {
    public static void main(String[] args) {
        int all= 543;

        int a = all/100;
        int b = all%100/10;
        int c = all%10;

        int t =b / c;
        int k = a / c;

        if( all > 300){
            System.out.println(t);
        }else{
            System.out.println(k);
        }
    }
}
