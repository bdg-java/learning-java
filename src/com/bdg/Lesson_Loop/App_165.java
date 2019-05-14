package com.bdg.Lesson_Loop;

public class App_165 {
    public static void main(String[] args) {
        int n =81;
        boolean t = true;
        for( int i = 0; i<n; i++){
          if(n%3 == 0){
              t = true;
          }else{
              t = false;
          }

        }
        System.out.println(t);



    }
}
