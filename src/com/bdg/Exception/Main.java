package com.bdg.Exception;

public class Main {

    public static void main(String[] args) {
        int [] myNumbers = {1,2,3};

    try{
        System.out.println(myNumbers[5]);
    }catch (Exception e){
        System.out.println("Somthing went wrong");
    }finally {
        System.out.println("It will print always");
    }
    }
}
