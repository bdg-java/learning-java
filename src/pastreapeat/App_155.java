package src.pastreapeat;

public class App_155 {
    public static void main(String[] args) {
        sum_Of_DubleDigitNumbers_DividedByeSomeNumber(3);
    }

    public static void sum_Of_DubleDigitNumbers_DividedByeSomeNumber(int numb ){
        int sum = 0;
        for (int i = 10; i <= 99  ; i++) {
            if (i % numb == 0){
                sum += i;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
