package com.bdg.other;

public class Pool {
    public static void main(String[] args) {
        float speed;
        double waterQty = 0;
        int count = 0;
        for ( speed = 0.1f ; count <= 60  ; speed*=2,count++) {
            waterQty += 2*speed;
            System.out.println("Speed is: "+ speed+ ", timer: "+ count+", "+ waterQty+" liters||");
        }
        System.out.print(4.6116860871468646E17/2);//0.6000000089406967

    }
}
