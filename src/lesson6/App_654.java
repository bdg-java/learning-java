package lesson6;

public class App_654 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        int x = array.length;
        int y = 0;
        char [] z = new char [x];

        for (int i = 0; i < x; i++) {
            if (array[i] != 'a') {
                z[y] = array[i];
                y++;
            }
        }
        System.out.println(z);
    }
    }

