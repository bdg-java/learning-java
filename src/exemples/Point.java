package exemples;

public class Point {
    int x;
    int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (obj instanceof Point) {
            System.out.println("ESA");
            Point p = (Point) obj;
            return x == p.x && y == p.y;
        }
        System.out.println("THE LAST LINE");
        return false;
    }
}
