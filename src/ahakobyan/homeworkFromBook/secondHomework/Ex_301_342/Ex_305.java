package ahakobyan.homeworkFromBook.secondHomework.Ex_301_342;

import java.util.Vector;

public class Ex_305 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();

        for (int i = 1000; i <= 9999; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                vector.add(i);
            }
        }
        System.out.println(vector);
    }
}
