package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

import java.util.Arrays;

public class Ex_280 {
    public static void main(String[] args) {

        char[] array = {'a', 'c', 'f', 'r', 't'};
        char[] array1 = array.clone();

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 'f') {
                array1[i +1] = 'f';
                break;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
