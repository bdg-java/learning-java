package lesson4;

public class App_246 {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        double a = 0;
        int[] array = IntegerArrayOperations.getDefaultArray();
        for (int i = 1; i < array.length; i++) {
            a = Math.sqrt(i);
            if (a == (int) a) {
                sum += array[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }
}
