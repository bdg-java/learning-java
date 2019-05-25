package com.bdg.Lesson5;

public class App_648 {
    public static void main(String[] args) {
        int count = 0;
        int b = 0;
        char array [] = {'z','a','x','c', 'd','o','k','o','z','a'};
        int len = array.length;

        for(int i = 0; i < len; i++ ) {
            if (array[i] == 'x') {
                b = i++;
                for(int k = b; k <array.length; k++){
                    //System.out.println(array[k]);
                    if(array[k] == 'o'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
