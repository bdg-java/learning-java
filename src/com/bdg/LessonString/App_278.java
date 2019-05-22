package com.bdg.LessonString;

public class App_278 {
    public static void main(String[] args) {
        char sum;
        char na [] = {'o','r','n','d','f','a','a','m','l','e','h','k'};
        for(int i =0; i< na.length;i++){
            if(i%2 == 1){
                sum = na[i];
                char [] y = new char[]{sum};
                for(int j = 0; j<y.length; j++){
                    System.out.println(y[j]);
                }
            }
        }

    }
}
