package com.bdg;

public class App_51 {
  public static void main(String[] args) {
      boolean t = true;
      int a = 165;

      int c_one = a % 10;
      int b_one = a % 100/10;
      int a_one = a/100;
//
//      System.out.println(a_one+","+b_one+","+c_one);

      int ta = ( b_one + a_one);
      if(ta == c_one  ){
          t = true;
      }else{
          t = false;

      }
      System.out.println(t);
  }
}
