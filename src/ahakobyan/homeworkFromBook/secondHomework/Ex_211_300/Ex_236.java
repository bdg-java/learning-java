package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_236 {
    public static void main(String[] args) {

        int[] list = {45, 8, -7, 61, -76, -48, 31, 25};
        int a = 0;
        int b = 1;

        for (int i = 0; i < list.length ; i++) {
            if (list[i] % 2 != 0) {
                a++;
                b = b * list[i];
            }
        }
        System.out.println(a + " " + b);
    }
}
