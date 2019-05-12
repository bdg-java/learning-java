package ahakobyan;

public class App_62 {
    public static void main(String[] args) {

        int t = 1563;
        int a = t % 10;
        int b = t % 100 / 10;
        int c = (t / 100) % 10;
        int d = t / 1000;

        if (t < 5000){
            System.out.print(+(t/(a + c)));
        }else
            System.out.print(+(t/(d+b)));
    }
}
