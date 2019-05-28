package ahakobyan.app_646_670;

public class app_652 {
    public static void main(String[] args) {

        char [] x = {'e', 'b', 'c', '4', 'f', 'd', 'h'};
        char [] z = {'e', 'b', 'c', '4', 'f', 'j', 'k'};
        char [] y = new char[z.length];
        int a = 0;

        for (int  i = 0; i < x.length; i ++) {
            for (int f = 0; f < z.length; f++) {
                if (z[f] == x[i]) {
                    a++;
                    y[a] = z[f];
                }
            }
        }
        System.out.println(y);
    }
}
