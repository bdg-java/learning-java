package ahakobyan.app_646_670;

public class app_649 {
    public static void main(String[] args) {

        char [] x ={'e', 'b', 'c', '4', 'f', 'd', 'e'};
        int b = 0;
        int c = -1;
        int d =0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'z' && b == -1) {
                b = i;
            }
            if (x[x.length - i - 1] == 'z' && c == -1 && b < x.length - i - 1 ) {
                d = b -c - 1;
            }
        }
        System.out.println(d);
    }
}
