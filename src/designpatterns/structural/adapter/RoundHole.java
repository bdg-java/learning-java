package designpatterns.structural.adapter;

public class RoundHole {
    private double radius;
    public RoundHole(double radius){
        this.radius = radius;

    }
    public double getRadius() {
        return radius;
    }

    public boolean feats(RoundPeg peg){
        return radius>=peg.getRadius();
    }
}
