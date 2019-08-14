package src.pastreapeat;

public class App_25 {
    public static void main(String[] args) {
        int a = 1, b = 2 , c = 3;
        validTriangle(a,b,c);

    }

    public static void validTriangle(int first , int second , int third){
        if (first < (second + third) && second < (first + third) && third < (first + second ))
            System.out.println("y = 1");
        else {
            System.out.println("y = 2");
        }
    }
}
