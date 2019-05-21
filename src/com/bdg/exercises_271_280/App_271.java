package com.bdg.exercises_271_280;

public class App_271 {

    public static void main(String[] args) {
       char[] chars = CharOperations.getDefaultCharArray();
       int count = 0;
       for (int i=0;i<chars.length;i++){
           if(chars[i] == 'a'){
            count++;
           }
       }
        System.out.println(count);
    }
}
