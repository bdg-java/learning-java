package lesson6;

public class App_669 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int x = array.length;
        boolean t = false;
        int count = 0;
        for (int i = 0; i < x / 2; i++) {
            if (array[i] != array[x - 1 - i]) {
                t = false;
                break;
            } else
                t = true;
        }
        for (int i = 0; i < x; i++) {
            if (t && (array[i] == 'a'))
                count++;
            if (!t && (array[i] == 'b'))
                count++;

        }
        System.out.println(count);
    }
}
