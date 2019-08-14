package src.pastreapeat;

public class App_21 {
    public static void main(String[] args) {
        int a = 100, b = 10, c = 24;
        maxValue(a,b,c);

    }

    public static void maxValue(int...number){
        int max = 0;
        for (int i = 0; i <number.length ; i++) {
            if (max < number[i] ){
                max = number[i];
            }
        }
        System.out.println("Max value is " + max);
    }

}

