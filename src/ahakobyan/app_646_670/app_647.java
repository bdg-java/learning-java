package ahakobyan.app_646_670;

public class app_647 {
    public static void main(String[] args) {

        char [] x ={'e', 'b', 'c', '4', 'f', 'd', 'e'};
        boolean t = false;
        int a = x.length;

        for (int i = 0; i < a/2; i++) {
            if (x[i] == x[a - i - 1]) {
                t = false;
            } else {
                t = true;
            }

        }
        System.out.println(t);
    }
}
