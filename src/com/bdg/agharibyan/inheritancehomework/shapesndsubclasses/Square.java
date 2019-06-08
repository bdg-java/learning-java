package com.bdg.agharibyan.inheritancehomework.shapesndsubclasses;

public class Square extends  Rectangle {

    public Square(){
    }

    public Square(double side){
    }
    //ete i skzbane haytararvats chi side, apa constructori marminy datark e mnum, te es verevum haytararem side?

    public Square(double side, String color, boolean filled){
    }
    //krkin  marmni mej vochinch chem grelu? superi superic chem karoghanum popokhakan kanchel

//    public double getSide(){
//        //?return side;
//    }
    //erevi skzbum piti haytararem side popokhakany

    public void setSide(double side){
        //this.side = side;
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    public String toString(){
        return"Square";
    }
}
//inch petq e grei toStringi mej?