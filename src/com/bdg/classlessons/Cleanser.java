package com.bdg.classlessons;

public class Cleanser {
    private String s = "Cleanser";

//    public Cleanser(){
//        s = "default constructor";
//    }

    public    Cleanser(String a){
        s = a;


    }

    public String returnS(){
        return s;
    }

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public String scrub() {
        append(" scrub()");
        return  "ss";
    }

    public String toString() {
        append("aaaaaaaaaaaaa");
        return "hereee";
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser("kk");
        x.dilute();
        System.out.println(x.s);
        x.apply();
        System.out.println(x.s);
        x.scrub();
        System.out.println(x.s);
        System.out.println(x);
    }
}