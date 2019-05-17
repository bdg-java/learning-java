package lesson4;

public class App_220 {
    public static void main(String[] args) {
        int counter = 0;
        int a = 12;
        int[] array = IntegerArrayOperations.getDefaultArray();

        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0 || array[i] < 0)
                counter++;
            }
            System.out.println(counter);
        }
    }

