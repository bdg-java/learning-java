package lesson5;

public class App_276 {
    public static void main(String[] args) {
        int x = 0;
        char[] array = {'a', 'b', 'c', 'r'};
        boolean t = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'r') {
                    t = true;
                    break;
                }
            }
            System.out.println(t);

        }
}
