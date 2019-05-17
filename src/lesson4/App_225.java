package lesson4;

public class App_225 {
    public static void main(String[] args) {
        int t = 65;
        int[] array = IntegerArrayOperations.getDefaultArray();
        int mul = 1;

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < t) {
                mul *= array[i];
            }
            System.out.println(mul);
        }

    }
}
