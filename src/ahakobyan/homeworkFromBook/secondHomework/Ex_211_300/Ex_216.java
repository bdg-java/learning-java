package ahakobyan.homeworkFromBook.secondHomework.Ex_211_300;

public class Ex_216 {
    public static void main(String[] args) {
        int[] list = {45, 8, -7, 61, -76, -48, 31, 25};
        int a = 1;

        for (int i = 0; i < list.length; i+= 2) {
            a = a * list[i];
        }
        System.out.println(a);
    }
}