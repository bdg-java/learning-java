package ahakobyan.homeworkFromBook.firstHomework;

public class Ex_183 {
    public static void main(String[] args) {


        int n = 20;
        int k;

        for (int i = 0; i >= 0; i++) {
            if (Math.pow(3, i) > n) {
                k = i;
                System.out.println(k);
                break;
            }
        }
    }
}
