package com.bdg.LessonString;

public class App_279 {
    public static void main(String[] args) {
        char sum;
        char na [] = {'o','r','n','d','s','a','a','m','l','e','h','k'};
        for(int i =0; i< na.length;i++){
            if(na[i] > 'k' ){
                sum = na[i];
                char [] y = new char[]{sum};
                for(int j = 0; j<y.length; j++){
                    System.out.println(y[j]);
                }
            }
        }




    }
}
