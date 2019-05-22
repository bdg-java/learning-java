package com.bdg.LessonString;

public class App_294 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7};

        int sum = 0;

        for(int i = 0; i < x.length; i++){
            if(i%2 == 1){
                sum = x[i];
                int [] y = new int[]{sum};
                for(int j =0; j < y.length; j++){
                    System.out.println(y[j]);

                }
            }
        }
    }
}
