package ahakobyan.app_271_280;

public class app_279 {
    public static void main(String[] args) {

        char[] x = {'e', 'r', 'c', '4', 'f', 'j', 'k' };
        char[] z = new char[x.length];
        int a= 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > 'k'){
                z[a] = x[i];
                a++;
            }
        }
        System.out.println(z);
    }
}
