package com.bdg.lesson_151_200;

    public class App_164 {
        public static void main(String[] args) {
            int n = 7;
            int min = 1;

            for (int i=100;i<=999;i++) {
                if (Math.sqrt(i) > n) {
                    min = i;
                    break;
                }
            }
            System.out.println(min);
        }
    }