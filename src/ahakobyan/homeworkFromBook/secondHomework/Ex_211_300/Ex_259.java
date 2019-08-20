package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_259 {
    public static void main(String[] args) {

        int[] array = {4, 9, 1, 64, 51, 27, 8};
        int min = array[0];
        int num = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
                num = i;
            }
        }
        System.out.println(num);
    }
}
