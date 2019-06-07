package com.bdg.other;

public class Pool {
    public static void main(String[] args) {
//        int speed = 1;
        long waterQty = 100;
        int count = 0;
        for (int speed = 1; count <= 60  ; speed*=2,count++) {
            waterQty += 2*speed;
            System.out.println("Speed is: "+ speed+ ", timer: "+ count+", "+ waterQty+" liters||");
        }
    }
}
