package com.bdg.lesson_151_200;

public class App_168 {
    public static void main(String[] args) {
 int n = 100;
 int i;

 for(i=2;i<=Math.sqrt(n);i++) {
     if(n%i == 0) {
         System.out.println(false); break;
     } else {
         System.out.println(true);
     }
 }
    }
}
