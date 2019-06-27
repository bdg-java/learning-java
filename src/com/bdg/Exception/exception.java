package com.bdg.Exception;

public class exception {
    public static void main(String[] args) {
        try {
            MyClassnew.checkAge(14);
        }catch (YourOldExceaption aa){
            System.out.println(aa.getMessage());
        }
    }
}
