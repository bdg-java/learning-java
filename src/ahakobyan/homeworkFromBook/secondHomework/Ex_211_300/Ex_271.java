package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_271 {
    public static void main(String[] args) {

        char[] array = {'a', 'c', 'f', 'r', 't'};
        int count = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
