package Classed;

public class Circle {




    private Double radius;
    private String color;


    public Circle ( Double radiouse, String color){

        this.radius = 1.0;
        this.color = "red";

    }

         public double getradius () {
         return this.radius;

    }

         public String  getcolor (){

        return this.color;

         }

         public void setradiouse (Double radouse ){
         this.radius = radius;


         }

         public void setclor ( String color){
             this.color = color ;


         }

         public String toString (){

           return "CirclewithColor: " + this.radius + ", " + this.color;
         }



}

