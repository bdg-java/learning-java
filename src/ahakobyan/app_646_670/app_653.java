package ahakobyan.app_646_670;

public class app_653 {
    public static void main(String[] args) {

        char [] x = {'e', 'b', 'c', '4', 'f', 'd', 'e'};
        int a = 0;
        int b = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'a') {
                a++;
            }
        }
        char [] z = new char[x.length + a];
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'a') {
                z[b] = x[i];
                z[b +1] = 'c';
                b++;
            }else
                z[b] = x[i];
            b++;
        }
        System.out.println(z);
    }
}
