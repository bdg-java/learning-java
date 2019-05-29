package com.bdg.exercises_646_670;

public class App_653 {
    public static void main(String[] args) {
        char[] chars = {'a','g','u','a','z'};
        int count = 0;
        for (int i=0;i<chars.length;i++){
            if(chars[i] == 'a'){
                count++;
            }
        }

        char[] newChar = new char[chars.length+count];
        int index =0;
        for (int i=0;i<chars.length;i++){
            if(chars[i] == 'a'){
                newChar[index+1] = 'c';
                newChar[index] = chars[i];

            }else {
                newChar[index] = chars[i];

            }
            index++;
        }
        System.out.println(newChar);
    }
}
