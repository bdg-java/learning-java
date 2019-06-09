package com.bdg.Inheritance;

public class Cylinder  extends Circle {

    private double height = 1.0;

    public Cylinder (){
        //stex evs petqa kanchel circle-i constructor-y, ete jarangum es u parent class-y uni constructor petqa kanches
    }

    public Cylinder ( double radius){
        super(radius); //Circle -i constructory 2 parameter-a stanum radius u collor, dra hamara xndir talis

    }

    public Cylinder ( double radius,  double height){
        super(radius);
        this.height = height;
    }

    public Cylinder ( double radius, double hight , String color){
        super(height,color); //height>? radiusa stanum
        this.height = hight;
    }

    public double getHigth (){
        return height;
    }

    public void setHeight (double height){
        this.height = height;
    }

    public double getVolume ( ){

        return height * super.getArea();


        }

    }



}
