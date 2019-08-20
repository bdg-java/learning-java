package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_231 {
    public static void main(String[] args) {

        int[] list = {45, 8, -7, 61, -76, -48, 31, 25};
        int a = 0;

        for (int i = 0; i < list.length ; i++) {
            if (list[i] % 2 == 0 ) {
                a = a + (list[i] * list[i]);
            }
        }
        System.out.println(a);
    }
}
