package ahakobyan.collections;


import java.util.List;

public class appl {
    public static void main(String[] args) {

        List<Integer> list = new LinkedListImpl<>();

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(87);
        list.add(67);
        System.out.println(list.contains(67));

    }
}
