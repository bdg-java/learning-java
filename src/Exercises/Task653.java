package Exercises;

public class Task653 {
    public static void main(String[] args) {
        char[] array = {'s', 'b', 'a', 'm', 'a', 'z'};
        int n = array.length;
        int count = 0;
        int m = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] == 'a') {
                count++;
            }
        }
        char [] x = new char[n + count];
        for (int i = 0; i < n; i++) {
            if (array[i] == 'a') {
                x[m] = array[i];
                x[m + 1] = 'c';
                m++;
            } else
                x[m] = array[i];
            m++;

        }
        System.out.println(x);
    }

    }

