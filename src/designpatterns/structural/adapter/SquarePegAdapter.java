package designpatterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg){
        this.squarePeg = squarePeg;

    }

    @Override
    public double getRadius() {
        //logic where round is on square
        return squarePeg.getWidth()*2;
    }
}
