package ahakobyan.app_646_670;

public class app_664 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', 'c', 'x', 'd', 'e'};
        int a = 0;
        boolean t = false;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > 'd') {
                t = true;
                break;
            } for (i = 0; i < x.length; i++)
            if (t && x[i] == 'c') {
                a++;
            }for (i = 0; i <x.length; i++)
            if (!t && x[i] == 'd') {
                a++;
            }
        }
        System.out.println(a);
    }
}
