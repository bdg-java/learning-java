package lesson4;

public class App_230 {
    public static void main(String[] args) {
        double sum = 0;
        int[] array = IntegerArrayOperations.getDefaultArray();
        int a = 0;
        int k = 10;

        for (int i = 0; i < array.length; i++) {

            if (k % array[i] == 0) {
                a++;
                sum += Math.pow(array[i], 2);
                System.out.println(array[i]);
            }
            sum = Math.sqrt(sum / a);
            System.out.println(sum);
        }
    }
}
