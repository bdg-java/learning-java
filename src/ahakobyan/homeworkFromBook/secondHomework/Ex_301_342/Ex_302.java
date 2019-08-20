package ahakobyan.homeworkFromBook.secondHomework.Ex_301_342;

import java.util.Vector;

public class Ex_302 {
    public static void main(String[] args) {

        Vector vector = new Vector();

        for (int i = 100; i <= 999; i++) {
            if (i % 5 == 2) {
                vector.add(i);
            }
        }
        System.out.println(vector);
    }
}
