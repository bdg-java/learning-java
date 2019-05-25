package com.bdg.Lesson5;

public class App_659 {
    public static void main(String[] args) {
        char n = 0;
        int count = 0;
        char array[] = {'z', 'a', 'b', 'c', 'd', 'o', 'k', 'c', 'z', 'a', 'w', 'g'};
        int len = array.length;

        for (int i = 1; i < len; i++) {

           if(array[i] == 'x'){
               if(array[i] == 'c'){
                   count++;
               }
           }else{
               if(array[i] == 'd'){
                   count++;
               }

           }

        }
        System.out.println(count);
    }
}
