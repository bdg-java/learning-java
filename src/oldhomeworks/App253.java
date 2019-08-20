package oldhomeworks;

public class App253 {
    public static void main(String[] args) {
        int [] arr=IntArray.getDefaultArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max + min);
    }
}
