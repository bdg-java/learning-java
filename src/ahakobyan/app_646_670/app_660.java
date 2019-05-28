package ahakobyan.app_646_670;

public class app_660 {
    public static void main(String[] args) {

        char[] x = {'a', 'b', 'c', '4', 'x', 'd', 'e'};
        int a = 0;
        char[] z = new char[x.length];
        int b = 2;

        for (int i = 0; i < x.length; i ++) {
            if (i == b) {
                z[i] = 'a';
                b+= 3;
            }else {
                z[i] = x[i];
            }
        }
        System.out.println(z);
    }
}
