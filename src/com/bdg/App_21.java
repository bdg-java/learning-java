package com.bdg;

public class App_21 {


    public static void main(String[] args) {

        int a = 236;
        int b = 459;
        int c = 674;

      if (a > b ) {
          if (a > c) {
              System.out.println("a is maximum and value is : " + a);

          }
          else if (c > a) {
              System.out.println("c is maximum and value is : " + c);
          }
          /*else{
              System.out.println("c amd a are equal. a is : " + a + "c is : " + c);
          }*/
      }
      else if (b > a ){
            if (b > c){
               System.out.println (" b is maximum and value is : " + b);
            }
            else if (c > b) {
                System.out.println("c is maximum and value is : " + c);
            }
            /*else{
              System.out.println("b amd c are equal. b is : " + b + "c is : " + c);
          }*/
      }
      /*else{
          System.out.println("a amd b are equal. a is : " + a + "b is : " + b);
      }*/

    }
}
