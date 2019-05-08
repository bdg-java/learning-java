package com.bdg;

public class App_40 {
    public static void main(String[] args){

        int a = 100;
        int b = 800;
        int c = 900;
        int d = 500;



        if(a < b){

            if(b < c && b < d){
                if(c < d){
                    System.out.println("a,b,c,d");
                }else{
                    System.out.println("a,b,d,c");
                }
            }
            else if(c< b && c<d){

                if(b < d){
                    System.out.println("a,c,b,d");
                }else{
                    System.out.println("a,c,d,b");
                }
            }else{

                if(b < c){
                    System.out.println("a,d,b,c");
                }else{
                    System.out.println("a,d,c,b");
                }
            }
        }
        else if(c < a){
            if(a < b && a < d){
                if(b < d){
                    System.out.println("c,a,b,d");
                }else{
                    System.out.println("c,a,d,b");
                }
            }
            else if(b< a && b<d){

                if(a < d){
                    System.out.println("c,b,a,d");
                }else{
                    System.out.println("c,b,d,a");
                }
            }
            else{

                if(a < b){
                    System.out.println("c,d,a,b");
                }else{
                    System.out.println("c,d,b,a");
                }
            }
        }
   else if(d < a){
       if(a < b && a < c){
           if(b < c){
               System.out.println("d,a,b,c");
           }else{
               System.out.println("d,a,c,b");
           }
       }
       else if(b< a && b<c){

           if(a < c){
               System.out.println("d,b,a,c");
           }else{
               System.out.println("d,b,c,a");
           }
       }else{

           if(a < b){
               System.out.println("d,c,a,b");
           }else{
               System.out.println("d,c,b,a");
           }
       }
   }
        else{
            if(a < c && a < d){
                if(a < d){
                    System.out.println("b,a,c,d");
                }else{
                    System.out.println("b,a,d,c");
                }
            }
            else if(c< a && c<d){

                if(a < d ){
                    System.out.println("b,c,a,d");
                }else{
                    System.out.println("b,c,d,a");
                }
            }else{

                if(a < c){
                    System.out.println("b,d,a,c");
                }else{
                    System.out.println("b,d,c,a");
                }
            }
        }



    }
}
