package lesson4;

public class App_254 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max * min);
    }
}
