package com.bdg.pastreapeat;

public class App_160 {
    public static void main(String[] args) {
        for (int i = 100; i <999 ; i++) {
            double num = Math.sqrt(i * 16);
            if (num == (int)num /*% 2 == 0 || Math.sqrt(i * 16  ) % 3 == 0 ||
                    Math.sqrt(i * 16  ) % 5 == 0 || Math.sqrt(i * 16  ) % 7 == 0*/){
                System.out.println(i);
                break;
            }
        }
    }
}
