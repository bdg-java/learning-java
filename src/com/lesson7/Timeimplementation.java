package com.lesson7;

public class Timeimplementation {
    public static void main(String[] args) {
        Time t1 = Time.createTime(2, 15, 30);
        System.out.println(t1);
        t1.nextSecond();
        System.out.println(t1);
        t1.previusSecond();
        System.out.println(t1);
    }
}
