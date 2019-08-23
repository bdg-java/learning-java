package com.bdg.pastreapeat;

public  class App_27 {
    public static void main(String[] args) {
        int a = 1,b = 2 , c = 3;
        arithmeticalProgressionTest(a,b,c);

    }
    public static void arithmeticalProgressionTest(int... numbers){
        boolean bool = false;
        int first = 0;
        int second = 1;
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[first] == (numbers[i] - numbers[second])) {
                bool = true;
            } else {
                bool = false;
            }
            first++;
            second++;
        }
        System.out.println(bool);
    }
}
