package lesson4;

public class App_239 {
    public static void main(String[] args) {
        int c = 0;
        double sum = 0;
        int[] array = IntegerArrayOperations.getDefaultArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                c++;
                sum += Math.pow(array[i], 5);
            }
            sum = Math.sqrt(sum / c);
            System.out.println(sum);
        }
    }
}
