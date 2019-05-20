package lesson5;

public class App_275 {
    public static void main(String[] args) {
        int count = 0;
        char[] array = {'a', 'b', 'c', 'k'};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 'k') {
                count++;
            }
        }
            System.out.println(count);
        }
    }

