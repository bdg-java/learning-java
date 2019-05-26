package lesson6;

public class App_657 {
    public static void main(String[] args) {
        char[] array = {'x', 'a', 'b', 'c', 'd', 'e'};
        int x = array.length - 1;
        int a = 0;
        char[] b = new char[x / 2 + 1];

        for (int i = 0; i < x; i+= 2) {
            if (array[i] > array[i + 1])
                b[a] = array[i];
            else b[a] = array[i + 1];
            a++;
        }
        System.out.println(b);
    }
        }

