package ahakobyan.collections;

import java.util.LinkedList;

public class MarvelSeries {
    public static void main(String[] args) {


        LinkedList<String> series = new LinkedList<>();

        series.add("Captain America");
        series.add("Iron Man");
        series.add("Captain America: Civil War");
        series.add("Avengers: Infinty War");
        series.add("Avengers: EndGame");
        System.out.println(series);
        series.remove(2);
        System.out.println("Best Film Is " + series.get(2));
        series.set(3,"Avengers: Age Of Ultron");
        System.out.println("My Favorite Is " + series.get(3));
    }
}
