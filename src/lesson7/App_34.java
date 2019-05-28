package lesson7;

public class App_34 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 2;
        int d = 4;

        if (a + b == c + d)
            System.out.println("true");
        else if (a + c == b + d)
            System.out.println("true");
        else if (a + d == c + b)
                System.out.println("true");
        else
            System.out.println("false");

    }
}
