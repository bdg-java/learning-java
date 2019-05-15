package lesson3;

public class App_176 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n = 14;
        System.out.println("1 : " + n1 + "\n" + "2 : " + n2);
        for (int i = 3; i <= n; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(i + " : " + n3);
        }
    }
}
