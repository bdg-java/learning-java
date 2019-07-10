package ahakobyan.collections;

import java.util.ArrayList;

public class FootballPlayers {
    public static void main(String[] args) {


        ArrayList<String> players = new ArrayList<>();

        players.add("Messi");
        players.add("Ronaldo");
        players.add("Neymar");
        players.add("Suarez");
        players.add("Iniesta");
        players.add("Ter Stegen");
        System.out.println(players);
        System.out.println(players.size());
        players.remove("Ronaldo");
        players.set(4,"Alisson");
        System.out.println(players);
        System.out.println("Best Three Football Players Is " + players.get(0)+ " " + players.get(1)+ " " + players.get(2));
        System.out.println("Best Goalkeeper is " + players.get(4));
    }
}