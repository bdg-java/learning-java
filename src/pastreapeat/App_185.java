package src.pastreapeat;

public class App_185 {
    public static void main(String[] args) {
         int deposit = 30_000;
         double  percent = 1.2;// 20 %
        for (int i = 0; i < 24 ; i++) {
            deposit *= percent;
            if (deposit > 100_000){
                System.out.println("deposit is "+deposit+" in "+ i +" months");
                break;
            }
        }
    }
}
