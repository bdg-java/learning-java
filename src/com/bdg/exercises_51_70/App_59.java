package com.bdg.exercises_51_70;

public class App_59 {
    public static void main(String[] args) {
        int num = 807;
        int miavor = num % 10;
        int tasnavor = num % 100 / 10;
        int hayruravor = num / 100;
        int min;
        int max;
        int mid;
        if(miavor<tasnavor && miavor<hayruravor){
            min = miavor;
            if(tasnavor<hayruravor){
                max = hayruravor;
                mid = tasnavor;
            }else {
                max = tasnavor;
                mid = hayruravor;
            }
            System.out.println(min+","+mid+","+max);
        }else {
            if (tasnavor<hayruravor){
                min = tasnavor;
                if(hayruravor<miavor){
                    mid = hayruravor;
                    max = miavor;
                }else {
                    mid = miavor;
                    max = hayruravor;
                }
            }else {
                min = hayruravor;
            }
        }
    }
}
