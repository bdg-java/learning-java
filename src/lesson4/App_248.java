package lesson4;

public class App_248 {
    public static void main(String[] args) {
        int sum = 0;
        int k = 9;
        int[] array = IntegerArrayOperations.getDefaultArray();
        for (int i = 0; i < array.length; i++) {
            if (Math.pow((array[i] + i), 2) % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
