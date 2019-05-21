package lesson5;

public class App_280 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'f'};
        int x = 0;
        char[] newarray = new char[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        for (int i = 0; i < newarray.length; i++) {
            if (newarray[i] == 'f') {
            }
        }
        System.out.println(newarray);
    }

}
