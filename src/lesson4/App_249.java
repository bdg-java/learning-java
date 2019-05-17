package lesson4;

public class App_249 {
        public static void main(String[] args) {
            int count = 0;
            int k = 9;
            int[] array = IntegerArrayOperations.getDefaultArray();

            for (int i = 0; i < array.length; i++) {
                if (Math.abs(array[i] - i) > k)
                    count++;
            }
            System.out.println(count);
        }
    }

