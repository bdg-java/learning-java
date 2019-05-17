package lesson4;

public class App_252 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
