package oldhomeworks;

public class App152 {
    public static void main(String[] args) {


        int n = 45;
        int m = 1;
        for (int i = 1; i <= 1000; i++) {
            if(n%i==0)
                m =m*i;
        }
        System.out.println(m);
    }

}