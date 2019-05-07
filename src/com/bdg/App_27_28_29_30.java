package com.bdg;

public class App_27_28_29_30 {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 8;

//        APP-27
        int d = b-a ;

        if(b + d == c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
//APP-28
        int e =b/a;

        if(b*e == c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
//        APP-29
        if(c<b){
            if(b<a){
                System.out.println("c, b, a");
            }else{
                System.out.println("c, a, b");
            }
        } else if(a<b){
            if(b<c){
                System.out.println("a, b, c");
            }else{
                System.out.println("a, c, b");
            }
        }else{
            if(c<a){
                System.out.println("b, c, a");
            }else{
                System.out.println("b, a, c");
            }
        }
// App_30
        if(c>b){
            if(b>a){
                System.out.println("c, b, a");
            }else{
                System.out.println("c, a, b");
            }
        } else if(a>b){
            if(b>c){
                System.out.println("a, b, c");
            }else{
                System.out.println("a, c, b");
            }
        }else{
            if(c>a){
                System.out.println("b, c, a");
            }else{
                System.out.println("b, a, c");
            }
        }

    }
}
