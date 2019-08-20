package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_240 {
    public static void main(String[] args) {

        int[] list = {49, 8, -7, 61, -76, -48, 31, 25};
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[ i] % 7 == 0) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
