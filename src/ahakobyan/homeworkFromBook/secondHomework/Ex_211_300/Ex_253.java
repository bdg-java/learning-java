package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_253 {
    public static void main(String[] args) {

        int[] array = {4, 9, 1, 64, 51, 27, 8};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            } if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max + min);
    }
}