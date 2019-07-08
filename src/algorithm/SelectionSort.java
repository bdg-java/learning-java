package algorithm;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 8, 7, 0, 1, 3, 6};
        System.out.println(Arrays.toString(array));
        int n = array.length;
        int t = 0;

        for (int i = 0; i < array.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
                    t = array[minIdx];
                    array[minIdx] = array[i];
                    array[i] = t;
                }
        System.out.println(Arrays.toString(array));
    }
}







