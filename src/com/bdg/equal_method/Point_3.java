package com.bdg.equal_method;

import java.sql.SQLOutput;

public class Point_3 {
    int x = 0;
    int y = 0;

    public Point_3(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object sss){
        if(sss == this){
            return true;
        }
        if(sss instanceof Point){
            Point p = (Point) sss;
            System.out.println("last");
            return x == p.x && y == p.y;

        }
        System.out.println("last");

        return false;

    }
}
