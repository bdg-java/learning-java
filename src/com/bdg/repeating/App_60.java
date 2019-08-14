package com.bdg.repeating;

public class App_60 implements Vars  {
    public static void main(String[] args) {
        System.out.println(one + " " + two + " " + three);

        if(one > two && one > three){
            if(three> two){
                System.out.println(one + " " + three + " " + two);
            }else {
                System.out.println(one + " " + two + " " + three);
            }
        }else if(two > one && two > three){
            if(three> one){
                System.out.println(two + " " + three + " " + one);
            }else {
                System.out.println(two + " " + one + " " + three);
            }
        }else{
            if(two> one){
                System.out.println(three + " " + two + " " + one);
            }else {
                System.out.println(three + " " + one + " " + two);
            }
        }
    }

}
