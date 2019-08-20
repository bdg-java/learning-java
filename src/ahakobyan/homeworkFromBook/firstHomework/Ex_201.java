package ahakobyan.homeworkFromBook.firstHomework;

import java.util.ArrayList;
import java.util.List;

public class Ex_201 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int n = 4835;
        int n1 = 4835 % 10;
        int n2 = (4835 / 10) % 10;
        int n3 = (4835 / 100) % 10;
        int n4 = 4835 / 1000;
        list.add(n1); list.add(n2); list.add(n3); list.add(n4);
        System.out.println(list.size());
    }
}
