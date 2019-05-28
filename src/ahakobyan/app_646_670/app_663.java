package ahakobyan.app_646_670;

public class app_663 {
    public static void main(String[] args) {

        char [] x = {'a', 'b', 'c', 'c', 'x', 'd', 'e'};
        int a = 0;
        double sum = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'c')
            sum = sum +i;
            a++;
        }
        System.out.println(sum/a);
    }
}
