package ahakobyan.homeworkFromBook.secondHomework.Ex_301_342;

import java.util.Vector;

public class Ex_310 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();

        for (int i = 100; i <= 999; i++) {
            if (i % 10  == (i / 10) % 10) {
                vector.add(i);
            }
        }
        System.out.println(vector);
    }
}
