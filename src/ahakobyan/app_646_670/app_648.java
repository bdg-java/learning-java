package ahakobyan.app_646_670;

public class app_648 {
    public static void main(String[] args) {

        char [] x ={'e', 'b', 'c', '4', 'f', 'd', 'e'};
        int a = x.length;
        int b = -1;
        int c = -1;

        for (int i = 0; i < a; i++) {
            if (x[i] == 'x' && c == -1) {
                b = i;
            }
            if (x[i] == '0' && i > c && c != -1 ) {
                b++;
            }
        }
        System.out.println(b);
    }
}
