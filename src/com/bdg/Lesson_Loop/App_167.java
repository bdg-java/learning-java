package com.bdg.Lesson_Loop;

public class App_167 {
    public static void main(String[] args) {
      int  x= 2;

      for(int n=1; n>=30; n++){
        Math.sin(  Math.pow(x,n));
         if(( Math.sin(  Math.pow(x,n)))> 0){
             System.out.println("ok");
         }
      }


    }
}
