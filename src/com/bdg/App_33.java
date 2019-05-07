package com.bdg;

public class App_33 {
    public static void main(String[] args){
      int  a = 10;
      int  b = 1;
      int  c = 100;
      int  d = 1;

      if(a==1 ){
          if(b == 1 || c ==1 || d ==1 ){
              System.out.println(true);
          } else{
              System.out.println(false);
          }
      }else if(b == 1 || d==1){
          if(c == 1 ){
              System.out.println(true);
          }else if(b==d){
              System.out.println(true);
          }else{
              System.out.println(false);
          }
      }else{
          System.out.println(false);
      }
    }
}
