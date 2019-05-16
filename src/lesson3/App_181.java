package lesson3;

public class App_181 {
    public static void main(String[] args) {
        int n = 16;
        int k = 0;

        for(int i = 1; i < n; i++){
            if (Math.pow(2,i)== n){
                System.out.println(k);
            }
        }
    }
}
