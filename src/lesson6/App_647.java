package lesson6;

public class App_647 {
    public static void main(String[] args) {
        boolean t = false;
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        int x = array.length;
        for (int i = 0; i < x / 2; i++) {
            if (array[i] == array[x - 1 - i])
                t = true;
            else {
                t = false;
                break;
            }
        }
        System.out.println(t);
    }
    }

