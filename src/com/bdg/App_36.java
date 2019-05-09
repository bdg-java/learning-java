package com.bdg;

public class App_36 {
    public static void main (String[] args){
        int a = 17;
        int b = 8;
        int c = 40;
        int d = 16;


        int t = a%2;
        int tb = b%2;
        int tc = c%2;
        int dd = d%2;

        if(((t == 0 && tb ==0)) || (tc == 0 && dd ==0 )){
            System.out.println(1);
        } else if((tb ==0 && tc == 0 )|| (dd ==0 && t == 0)){
            System.out.println(1);
        } else if((t == 0 && tc == 0) || (tb ==0 && dd ==0)){
            System.out.println(1);
        }  else{
            System.out.println(2);
        }

    }
}
