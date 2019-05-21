package com.bdg.exercises_271_280;

public class App_272 {

    public static void main(String[] args) {
        boolean t = false;
        char[] chars = CharOperations.getDefaultCharArray();
        int count = 0;
        for (int i =0;i<chars.length;i++){
            if(chars[i] == 'b'){
                count++;
            }
        }
        if(count >= (chars.length)/2){
            t = true;
        }
        System.out.println(t);


    }
}
