package lesson6;

public class App_653 {
    public static void main(String[] args) {
    char[] array = {'a', 'b', 'c', 'd', 'e'};
    int x = array.length;
    int count = 0;
    int z = 0;

    for (int i = 0; i < x; i++) {
            if (array[i] == 'a') {
                count++;
            }
        }
        char[] b = new char[x + count];
        for (int i = 0; i < x; i++) {
            if (array[i] == 'a') {
                b[z] = array[i];
                b[z + 1] = 'c';
                z++;
            } else
                b[z] = array[i];
            z++;

        }
        System.out.println(b);
    }
}

