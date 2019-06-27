package com.bdg.Methods;

public class CheckAge {
    static void CheckAge(int x){

        if (x <18){
            System.out.println("not ok");
        }

        else {
            System.out.println("ok");
        }
    }

    public static void main(String[] args) {
       CheckAge(5);
    }

}
