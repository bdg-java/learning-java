package lesson5;

public class App_273 {
    public static void main(String[] args) {
        int sum = 0;
        char[] array = {'s', 'a', 'b', 'c', 's'};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 's') {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
