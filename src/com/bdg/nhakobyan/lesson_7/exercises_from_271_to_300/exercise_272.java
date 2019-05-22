package com.bdg.nhakobyan.lesson_7.exercises_from_271_to_300;

public class exercise_272 {
    public static void main(String[] args) {
        int n = 4;
        char array [] = {'b','b','f','y'};
        int count = 0;
        boolean t = false;
        for (int i = 0; i < array.length; i++) {
            /*array[i] = (char) (Math.random()*(97 - 63 + 1)+ 97 );
            System.out.print(array[i] +" ");*/
            if (array[i] == 'b'){
                count++;
            }
            if (count == n /2 ){
              t = true;
            }
        }
        System.out.println("\n"+t);
    }
}
