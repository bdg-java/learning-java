package src.pastreapeat;

public class App_181 {

    public static void main(String[] args) {
        int number = 1024;
        for (int i = 0; i < 13 ; i++) {
            if (Math.pow(2,i) == number ){
                System.out.println(Math.pow(2,i));
                break;
            }
        }
    }
}
