package com.bdg.tutlettersStringDemontioalArray;

public class Hashcodes {
    public static void main(String[] args) {
        String one = "aaa";
        String two = new String("aaa");

        if(one.hashCode() == two.hashCode()){
            if(one.equals(two)){
                System.out.println("Both Objects are equal. ");
            }else{
                System.out.println("Both Objects are not equal. ");
            }
        }
        else{
            System.out.println("Both Objects are not equal. ");
        }



        Integer ones = new Integer(55);
        Integer twos = new Integer(55);

        if(ones.hashCode() == twos.hashCode()){
            if(one.equals(two)){
                System.out.println("Both Objects are equal. ");
            }else{
                System.out.println("Both Objects are not equal. ");
            }
        }
        else{
            System.out.println("Both Objects are not equal. ");
        }
    }
}
