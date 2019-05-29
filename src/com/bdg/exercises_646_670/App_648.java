package com.bdg.exercises_646_670;

public class App_648 {
    public static void main(String[] args) {
        char[] chars = {'a','b','x','0','0','l','0'};
        int count = 0;
        boolean flag = false;
        for (int i=0;i<chars.length;i++){
            if(flag){
                if(chars[i] =='0'){
                    count++;
                }else {
                    flag = false;
                }
            }
            if(chars[i] == 'x'){
                if(chars[i+1] == '0'){

                    flag =true;
                }
            }
        }
        System.out.println(count);
    }
}
