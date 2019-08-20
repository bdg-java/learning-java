package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_273 {
    public static void main(String[] args) {

        char[] array = {'a', 'c', 's', 'r', 't', 's'};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 's') {
                count = count + i;
            }
        }
        System.out.println(count);
    }
}
