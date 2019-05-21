package com.bdg.exercises_271_280;

public class App_280 {

    public static void main(String[] args) {
        char[] chars = CharOperations.getDefaultCharArray();
        int index = 0;
        char[] newArray = new char[chars.length*2];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == 'f') {
                newArray[index+1] = 'f';
                newArray[index] = 'f';
            }else {
                newArray[index] = chars[i];
            }
            index++;

        }
        System.out.println(newArray);
    }
}
