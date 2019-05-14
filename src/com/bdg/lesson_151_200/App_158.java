package com.bdg.lesson_151_200;

public class App_158 {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        for(num = 100;num<=999;num++)
            if(num%2 != 0 && num%3 != 0) {
              sum += num;
    }
        System.out.println(sum);
  }
}