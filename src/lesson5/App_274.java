package lesson5;

public class App_274 {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        char[] array = {'a', 'b', 'c', 'h'};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 'h') {
                sum += i;
                x ++;
            }
        }
            System.out.println(sum / x);

        }
    }

