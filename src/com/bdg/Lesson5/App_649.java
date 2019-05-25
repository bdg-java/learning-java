package com.bdg.Lesson5;

public class App_649 {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        char array [] = {'z','a','b','c', 'd','o','k','c','z','a'};
        int len = array.length;

        for(int i = 0; i < len; i++ ) {
            if (array[i] == 'z') {
              int  b = i++;
                n += i;
              int c = n - b;
                sum = b - c;
            }
        }
        System.out.println(sum+1);

    }
}
