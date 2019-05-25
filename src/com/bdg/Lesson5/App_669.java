package com.bdg.Lesson5;

public class App_669 {
    public static void main(String[] args) {
        char n = 0;
        int count = 0;
        char array[] = {'z', 'a', 'b', 'b', 'a', 'z'};
        int len = array.length;

        for (int i = 0; i < len; i++) {
            if(array[len-i-1] == array[i]){
                if(array[i] == 'a'){
                    count++;
                }
            }else{
                if(array[i] == 'b'){
                    count++;
                }
            }
        }
        System.out.println(count );
    }
}
