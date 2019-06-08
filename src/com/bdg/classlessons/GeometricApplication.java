package com.bdg.classlessons;

import com.bdg.inheritance.Circle;
import com.bdg.inheritance.Cylinder;

public class GeometricApplication {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(new Circle(10), 30, "Cylinder");
        cylinder.volume();
        cylinder.name();
    }
}

































