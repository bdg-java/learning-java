package com.bdg.classlessons;


public class Detergent extends Cleanser {

    public Detergent(){
       // append("aa");
       super("pp");
    }
    // Change a method:
    public String scrub() {

        append("sssssss");
        return super.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam() {
        append(" foam()");
    }

    // Test the new class:
    public static void main(String[] args) {

        Detergent x = new Detergent();
//        x.dilute();
//        x.apply();
//       x.scrub();
//        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");

    }


}