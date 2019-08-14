package src.pastreapeat;


import static src.pastreapeat.App_29.growthOrderSort;

public class App_59 {
    public static void main(String[] args) {
        int first,second,third;
        int num = 402;
        first = num % 10;
        second = (num / 10) % 10;
        third = num / 100;
        growthOrderSort(first,second,third);
    }
}
