package Exercises;

public class Task646 {
    public static void main(String[] args) {
        int count = 0;
        char[] array = {'s', 'b', 'a', 'm', 'a', 'z'};

        for (int i = 0; i < array.length; i ++) {
            if (array[i] == 'a')
                count++;
            }
        System.out.println(count);
        }
    }
