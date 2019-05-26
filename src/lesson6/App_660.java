package lesson6;

public class App_660 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        int x = array.length;
        char[] n = new char[x];
        int m = 2;

        for (int i = 0; i < x; i++) {
            if (i == m) {
                n[i] = 'a';
                m += 3;
            } else
                n[i] = array[i];
        }
        System.out.println(n);
    }
}
