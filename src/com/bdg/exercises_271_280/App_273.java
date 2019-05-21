package com.bdg.exercises_271_280;

public class App_273 {

    public static void main(String[] args) {
        char[] chars = CharOperations.getDefaultCharArray();
        int sum = 0;
        for (int i =0;i<chars.length;i++){
            if(chars[i] == 's'){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
