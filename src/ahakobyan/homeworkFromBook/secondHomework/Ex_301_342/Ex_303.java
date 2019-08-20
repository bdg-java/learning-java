package ahakobyan.homeworkFromBook.secondHomework.Ex_301_342;

import java.util.Vector;

public class Ex_303 {
    public static void main(String[] args) {


        int n = 104;
        Vector<Integer> vector = new Vector();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                vector.add(i);
            }
        }
        System.out.println(vector);
    }
}
