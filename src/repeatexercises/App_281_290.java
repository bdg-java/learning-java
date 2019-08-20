package repeatexercises;

import java.util.Arrays;

public class App_281_290 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 1, 56,13};
        App_281_290 app_281_290 = new App_281_290();
        System.out.println(Arrays.toString(app_281_290.app284(arr)));
        System.out.println(Arrays.toString(app_281_290.app290(arr)));
    }

    public int[] app284(int[] arr) {
        int count = 0;
        int first = 3;
        int last = 35;
        for (int i : arr) {
            if (i >= first && i <= last) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i : arr) {
            if (i >= first && i <= last) {
                newArray[index] = i;
                index++;
            }
        }

        return newArray;

    }


    public int[] app290(int[] arr) {
        int count = 0;

        for (int i : arr) {
            if (i % 6 == 1) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i : arr) {
            if (i % 6 == 1) {
                newArray[index] = i;
                index++;
            }
        }

        return newArray;
    }
}
