package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

import java.util.Vector;

public class Ex_284 {
    public static void main(String[] args) {

        int[] array = {4, 9, -7, 3, -8, 15, 21, -10};
        Vector vector = new Vector();
        int a = -9;
        int b = 12;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > a && array[i] < b) {
                vector.add(array[i]);
            }
        }
        System.out.println(vector);
    }
}
