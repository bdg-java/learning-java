package ahakobyan.app_271_280;

public class app_278 {
    public static void main(String[] args) {

        char[] x = {'e', 'r', 'c', '4', 'f', 'j', 'k' };
        char[] z = new char[x.length];
        int a = 0;

        for (int i = 1; i <x.length; i+=2) {
            z[a] = x[i];
            a++;
        }
        System.out.println(z);
    }
}
