package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_266 {
    public static void main(String[] args) {


        int[] array = {4, 9, 1, 64, 51, 27, 8};
        int[] array1 = {5, 10, 2, 65, 52, 28, 9 };
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 != 0) {
                count = count + array[i];
            }
        }
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] % 2 == 0) {
                count1 = count1 + array1[j];
            }
        }
        System.out.println(count - count1);
    }
}
