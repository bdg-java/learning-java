package lesson6;

public class App_656 {
    public static void main(String[] args) {
        char[] array = {'x', 'a', 'b', 'c', 'd', 'e'};
        int a = array.length - 1;
        int b = 0;
        int c = 0;

        for (int i = 0; i < a; i++) {
            if (array[i] == 'x') {
                b++;
            }
            char[] m = new char[a + b];
            for (i = 0; i < a; i++) {
                if (array[i] == 'x') {
                    m[c] = 'y';
                    m[c + 1] = 'y';
                    c++;
                } else
                    m[c] = array[i];
                c++;

            }
            System.out.println(m);
        }
    }
}
