package com.bdg.Homework.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {

        Map hashMap = new HashMap();

        hashMap.put(11, "Soccer");
        hashMap.put(22, "Rugby");
        hashMap.put(33, "Baseball");
        System.out.println("Map is " + hashMap);

        System.out.println(hashMap.get(11));
        System.out.println(hashMap.get(22));
        System.out.println(hashMap.get(33));

    }
}
