package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_221 {
    public static void main(String[] args) {

        int[] list = {45, 8, -7, 61, -76, -48, 31, 25};
        int a = 20;
        int b = 50;
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] >= a && list[i] <= b) {
                count += list[i];
            }
        }
        System.out.println(count);
    }
}
