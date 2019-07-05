package algorithm;
import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args) {
            int[] array = {2, 5, 9, 8, 7, 0, 1, 3, 6};
            System.out.println(Arrays.toString(array));
            int n = array.length;
            int t = 0;
            for (int i = 0; i < array.length - 1; i++)
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        t = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = t;
                }
            }
                System.out.println(Arrays.toString(array));

            }
    }

