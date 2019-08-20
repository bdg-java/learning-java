package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

import java.util.Vector;

public class Ex_300 {
    public static void main(String[] args) {

        int[] array = {4, 9, -7, 3, -8, 37, 21, -10};
        Vector vector = new Vector();
        int k = 54;

        for (int i = 0; i < array.length ; i++) {
            if ((array[i] * array[i]) > k) {
                vector.add(array[i]);
            }
        }
        System.out.println(vector);
    }
}
