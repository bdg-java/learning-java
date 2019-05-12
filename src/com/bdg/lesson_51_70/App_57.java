package com.bdg.lesson_51_70;

public class App_57 {
    public static void main(String[] args) {
        int abc = 137;
        int a = abc / 100;
        int b = (abc % 100) / 10;
        float c = abc % 10;
        float rel1 = b / c;
        float rel2 = a / c;

           if (c != 0) {
            if (abc > 300) {
                System.out.println(rel1);
            } else {
                System.out.println(rel2);
              }
           }
        }
    }

