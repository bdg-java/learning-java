package lesson6;

public class App_659 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'x'};
        int count = 0;
        boolean t = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'x') {
                t = true;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (t && array[i] == 'c')
                count++;
            if (!t && array[i] == 'd')
                count++;
        }

        System.out.println(count);
    }
}
