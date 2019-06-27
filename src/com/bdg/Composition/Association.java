package com.bdg.Composition;

public class Association {
    public static void main(String[] args) {

        Bank obj = new Bank ("Axis");
        Emploee empObj = new Emploee("Neha");
        System.out.println(empObj.getName() +
                " is employee of " + obj.getBankName());
    }
}
