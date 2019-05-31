package com.bdg.Lesson_5;

public class App_274 {
    public static void main(String[] args) {

        int x =0;
        int sum =0;
        char [] sim ={'a', 'z', 'x', 'r', 'f', 'v', 'g'};

        for (int i = 0; i < sim.length; i ++){
            if (sim[i] > 'h'){
                System.out.println(sim[i]);
                sum +=i;
                x++;
            }
        }
        System.out.println(sum/x);
    }
}
