package com.bdg.interfaces;

interface  MoveTry {
      int number =3;
     default String retString(){
         return "Aa";
     }
    private void move(){
        System.out.println("aa");
    };
    private static void staticMove(){
         System.out.println("static");
     }
}
