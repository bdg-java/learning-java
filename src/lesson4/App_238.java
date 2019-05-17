package lesson4;

public class App_238 {
    public static void main(String[] args) {
        int c = 0;
        int sum = 0;
        int[] array = IntegerArrayOperations.getDefaultArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                c++;
                sum += array[i];
                System.out.println(array[i]);
            }
        }
        System.out.println((double) sum / c);
    }
}
