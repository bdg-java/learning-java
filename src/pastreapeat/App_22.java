package src.pastreapeat;

public class App_22 {
    public static void main(String[] args) {
        int a = -1, b = 2, c = -4;
        minValue(a,b,c);

    }

    public static void minValue(int...numbers){
        int min = 0;
        for (int i = 0; i <numbers.length ; i++) {
            if (min > numbers[i] ){
                min = numbers[i];
            }
        }
        System.out.println("Min value is " + min);
    }
}
