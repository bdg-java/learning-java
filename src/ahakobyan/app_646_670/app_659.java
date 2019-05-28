package ahakobyan.app_646_670;

public class app_659 {
    public static void main(String[] args) {

        char[] x = {'a', 'b', 'c', '4', 'x', 'd', 'e'};
        int a = 0;
        boolean t = false;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'x') {
                t = true;
            }
        }
        for (int i = 0; i < x.length; i++)
            if (t && x[i] == 'c') {
                a++;

                for (i = 0; i < x.length; i++) {
                    if (!t && x[i] == 'd') {
                        a++;
                    }
                }
            }
        System.out.println(a);
    }
}