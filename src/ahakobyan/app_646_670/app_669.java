package ahakobyan.app_646_670;

public class app_669 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', 'z', 'x', 'z', 'e'};
        int n = x.length;
        int a = 0;
        char [] z = new char[n];
        boolean t = false;

        for (int i = 0; i < n/2; i++) {
            if (x[i] != x[n - 1 -i]) {
                t = false;
            }else
                t = true;
        }
        for (int i = 0; i < n; i++) {
            if (t && x[i] == 'a') {
                a++;
            }
        }
        for (int i = 0; i < n; i++)
            if (!t && x[i] == 'b') {
                a++;
        }
        System.out.println(a);
    }
}
