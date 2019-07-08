package algorithm;
import java.util.Arrays;

public class InsrtionSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 8, 7, 0, 1, 3, 6};
        System.out.println(Arrays.toString(array));
        int n = array.length;

        for (int i = 1; i < array.length; i++) {
            int k = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > k) {
                array[j + 1] = array[j];
                j = j - 1;
                array[j + 1] = k;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}