package lesson4;

public class App_247 {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        int[] array = IntegerArrayOperations.getDefaultArray();
        for (int i = 1; i < array.length; i++) {
            if (array[i] > i) {
                sum += Math.pow(array[i], 2);
                count++;
            }
        }
        sum = Math.sqrt(sum / count);
        System.out.println(sum);
    }
}
