package com.bdg.equal_method;

public class Poitn_2 {
    int x;
    int y;

    public Poitn_2() {
        x = 0;
        y = 0;
    }

    public Poitn_2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Point) {
            System.out.println("esa");
            Point p = (Point) obj;
            return x == p.x && y == p.y;
        }
        System.out.println("THE LAST LINE");
        return false;
    }

}