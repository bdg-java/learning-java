package designpatterns.structural.adapter;

public class Application {

    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg(5);
        RoundHole roundHole = new RoundHole(6);
        System.out.println(roundHole.feats(roundPeg));
        SquarePeg squarePeg = new SquarePeg(2);
        //roundHole.feats(squarePeg);error

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        roundHole.feats(squarePegAdapter);


    }
}
