package lesson4;

public class App_258 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}