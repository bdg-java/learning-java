package com.bdg.LessonString;

import java.util.Arrays;

public class App_274 {
    public static void main(String[] args) {
        int sum =0;
        char na [] = {'o','k','n','d','s','a','a','m','l','e','h','k'};
          for(int i =0; i< na.length;i++){
              if(na[i] >'h'){
                  sum = sum + i;
              }
          }
        System.out.println(sum/2);


    }
}
