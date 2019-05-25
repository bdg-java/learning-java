package com.bdg.Lesson5;

public class App_667 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int mul = 1;
        char array[] = {'z', 'z', 'b', 'c', 'd', 'o', 'k', 'c', 'z', 'a', 'w', 'g'};
        int len = array.length;
        char[] y = new char[len - count];
        for (int i = 0; i < len; i++) {

            if( array[i] == 'z'){
                count +=i;
                sum += count;
                mul *= count;
                }
            }
        System.out.println(sum +" ," + mul);

    }
}
