package com.bdg.pastreapeat;

public class App_165 {
    public static void main(String[] args) {
        squareDegree(8,2);
    }
    public static void squareDegree(int verifiableNumber, int number  ){
        boolean bool = false;
        for (int i = 0; i < 5 ; i++) {
                if (Math.pow(number,i) == verifiableNumber){
                    bool = true;
                }
        }
        System.out.println(bool);


    }
}
