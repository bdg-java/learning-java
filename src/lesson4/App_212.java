package lesson4;

public class App_212 {
    public static void main(String[] args) {
        int[] array = IntegerArrayOperations.getDefaultArray();
        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i] * array[i];
            sum = Math.sqrt(sum / i);
            System.out.print(sum);


        }
    }
    }
