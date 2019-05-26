package lesson6;

public class App_655 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int x = array.length;
        char[] a = new char[x];

        for (int i = 0; i < x; i++) {
                a[x - i - 1] = array[i];
            }
            System.out.println(a);
        }
    }

