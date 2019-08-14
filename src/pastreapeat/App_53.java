package src.pastreapeat;

public class App_53 {
    public static void main(String[] args) {
        int num = 123;
        int k = 66;
        int plus = num/(num % 10 ) + ( num / 10 ) % 10 + (num / 100);
        if (plus > k){
            System.out.println("Plus "+ plus);
        }
        else {
            System.out.println("the other number "+((double)num % 10)/num);
        }
    }
}
