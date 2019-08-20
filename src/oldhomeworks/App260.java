package oldhomeworks;

import java.lang.reflect.Array;

public class App260 {
    public static void main(String[] args) {
        int []arr=IntArray.getDefaultArray();
        int min = IntArray.getMinElementOfArray(IntArray.generateArrayWithRandomNumbers(10));
        int i;
        for (i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == min)
                break;
        }
        System.out.println(i);

    }
}
