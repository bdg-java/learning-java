package com.bdg.lesson_21_40;

public class App_35 {
        public static void main(String[] args) {
            int a = 1, b = 1, c = 2, d = 1;

            if ((a  == b + c + d) || (b  == a + c + d) || (c == a + b + d) || (d == a + b + c) ) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
    }
