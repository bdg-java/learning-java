package exemples;

public class Loop {
    public static void main(String[] args) {

        int i = 0;
        System.out.println("while");
        while (i < 10) {
            System.out.println("I : " + ++i);
        }

        System.out.println("do while");
        do {
            System.out.println("I : " + ++i);
        } while (i < 20);

        System.out.println("for");

        for (int k = 0; k < 10; k++) {
            System.out.println("K : " + (k + 1));
        }

    }
}
