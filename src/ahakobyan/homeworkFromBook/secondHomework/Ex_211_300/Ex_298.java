package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

import java.util.Vector;

public class Ex_298 {
    public static void main(String[] args) {

        int[] array = {4, 9, -7, 3, -8, 37, 21, -10};
        Vector vector = new Vector();

        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 != 0) {
                vector.add(array[i]);
            }
        }
        System.out.println(vector);
    }
}
