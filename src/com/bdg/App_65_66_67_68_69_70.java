package com.bdg;

public class App_65_66_67_68_69_70 {
    public static void main(String[] args) {
        int all = 1544;

        int a = all/1000;
        int b = all%1000/100;
        int c = all%100/10;
        int d = all%10;
        int t =  c * d;

        if(t == 12){
            System.out.println("y=12");
        }else{
            System.out.println("y=0");
        }


//        App_66

        if(a == 4 || d == 4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
//        App_67

        int k = (a+b+c+d)*(a+b+c+d);
        if(k == all){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        //        App_68

        if(d > c){
            int ccc = b * d;
            System.out.println(ccc);
        }else{
            System.out.println(1);
        }

//        App 69
        int sum = a + b + c + d;
        int mul = a * b * c * d;

        if(sum > 20){
            int y = 1;
            System.out.println(y);
        }else{
            int y = 0;
            System.out.println(y);
        }

        if(mul > 200){
            int y = 0;
            System.out.println(y);
        }else{
            int y = 1;
            System.out.println(y);
        }


    }
}
