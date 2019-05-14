package lesson3;

public class App_177 {
    public static void main(String[] args) {
        int n = 14;
        double x1 = 1, x2 = 2;
        System.out.println("1 : " + x1 + "\n" + "2 : " + x2);
        for(int k =3; k <= n; k++) {
            double x3 = (x1 + 2* x2) / 3;
            x1 = x2;
            x2 = x3;
            System.out.println(k + ":" + x3);

        }
    }
}
