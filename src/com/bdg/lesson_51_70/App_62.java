package com.bdg.lesson_51_70;

public class App_62 {
    public static void main(String[] args) {
        int abcd = 2503;
        int a = abcd / 1000;
        int b = (abcd / 100) % 10;
        int c = (abcd % 100) / 10;
        int d = abcd % 10;
        float rel_bd = abcd / (d + b);
        float rel_ac = abcd / (a + c);

        if (b != 0 && d != 0) { if(abcd < 5000) {
            System.out.println(rel_bd);
        } else {
            System.out.println(rel_ac);
          }
        }
    }
}
