package sortingalgorithms;

import java.util.Arrays;

public class BubbleSort {

        public static void main(String[] args) {
            int arr[] = {53, 46, 35, 21, 145, 456, 3};
            System.out.println(Arrays.toString(arr));

            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j+1]) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                    }

                }
            System.out.println(Arrays.toString(arr));




        }
    }

