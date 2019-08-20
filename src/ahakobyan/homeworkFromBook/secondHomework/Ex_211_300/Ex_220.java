package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_220 {
    public static void main(String[] args) {

        int[] list = {45, 8, -7, 61, -76, -48, 31, 25};
        int a = 0;
        int b = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) {
                a++;
            }else b++;
        }
        System.out.println(a + " " + b);
    }
}
