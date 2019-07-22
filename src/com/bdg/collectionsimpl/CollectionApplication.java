package com.bdg.collectionsimpl;

import java.util.*;

public class CollectionApplication {

    public static void main(String[] args) {
        User u1 = new User("abc", 10);
        User u2 = new User("abc", 5);
        User u3 = new User("abc", 60);
        User u4 = new User("abc", 60);

//        Set<User> users = new HashSet<>();
//        users.add(u1);
//        users.add(u2);
//        System.out.println(users);
//        System.out.println(users.contains(new User("abc")));

        Map<User, Integer> map = new HashMap<>();
        map.put(u1, 10);
        map.put(u2, 20);
        map.put(u3, 30);

        Comparator<User> comparator = (o1, o2) -> {
            if (o1.age == o2.age) return 0;
            return o1.age > o2.age ? 1 : -1;
        };

        Set<User> users = new TreeSet<>((o1, o2) -> {
            if (o1.age == o2.age) return 0;
            return o1.age > o2.age ? 1 : -1;
        });
        users.add(u1);
        users.add(u2);
        users.add(u3);

        System.out.println(users);

    }
}
