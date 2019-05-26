package lesson6;

public class App_651 {
    public static void main(String[] args) {
            char[] array = {'a', 'b', 'c', 'd', 'e'};
            char[] x = new char[array.length];
            int k = 0;
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                char found = array[i];
                for (int m = 0; m < array.length; m++) {
                    if (array[i] == array[m]) {
                        count++;
                        found = array[m];
                    }
                }
                if (count == 1) {
                    x[k] = found;
                    k++;
                }
                count = 0;
            }
            System.out.println(x);
        }

    }
