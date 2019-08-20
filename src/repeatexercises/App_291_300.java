package repeatexercises;

import java.util.Arrays;

public class App_291_300 {
    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 14, 56, 6, 21};
        App_291_300 app_291_300 = new App_291_300();
        System.out.println(Arrays.toString(app_291_300.app292(arr)));
        System.out.println(Arrays.toString(app_291_300.app300(arr, 50)));
    }

    public int[] app292(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 7 == 0) {
                count++;
            }

        }
        if (count == 0) return arr;
        int[] newArray = new int[arr.length - count];
        int index = 0;
        for (int i : arr) {
            if (i % 7 != 0) {
                newArray[index] = i;
                index++;
            }

        }
        return newArray;
    }

    public int[] app300(int[] arr, int k) {
        int count = 0;
        for (int i : arr) {
            if (i * i < k) {
                count++;
            }

        }
        if (count == 0) return arr;
        int[] newArray = new int[arr.length - count];
        int index = 0;
        for (int i : arr) {
            if (i * i >= k) {
                newArray[index] = i;
                index++;
            }

        }
        return newArray;
    }
}
