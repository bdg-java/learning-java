package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_270 {
    public static void main(String[] args) {

        int[] array = {4, 9, 1, 64, 51, 27, 8};
        int[] array1 = {5, 10, 2, 65, 52, 28, 9 };
        long count = 1;
        long count1 = 1;

        for (int i = 0; i < array.length; i++) {
            count = count * array[i] * array[i];
        }
        for (int j = 0; j < array1.length ; j++) {
            count1 = count1 * array1[j] * array1[j];
        }
        System.out.println(count + count1);
    }
}
