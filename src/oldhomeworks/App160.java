package oldhomeworks;

public class App160 {
    public static void main(String[] args) {
        int minnum=1;
        for(int i=100; i<=999; i++){
            if(Math.sqrt(i*16) % 1 == 0) {
                minnum=i;
                break;
            }
        }
        System.out.println(minnum);
    }

}
