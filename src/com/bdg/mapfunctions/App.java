package com.bdg.mapfunctions;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        System.out.println("aaa");
        HashMap<String,String> hashMap =new HashMap<>();
        PhoneNumber phoneNumber1 = new PhoneNumber(374,0,2);
        PhoneNumber phoneNumber2 = new PhoneNumber(324,70,29);
        PhoneNumber phoneNumber3 = new PhoneNumber(334,80,20);
        HashMapImp<PhoneNumber,String> hashMapImp = new HashMapImp<>();
        hashMapImp.put(phoneNumber1,"first");
        hashMapImp.put(phoneNumber2,"second");
        hashMapImp.put(phoneNumber3,"third");
        System.out.println(hashMapImp.get(phoneNumber1));
        System.out.println(hashMapImp);






       // System.out.println(hashMap.hashCode());
//        hashMap.put("aaa","aaaa");
//        System.out.println(hashMap.hashCode());
//        String s ="aaa";
//        System.out.println(s.hashCode());
//        hashMap.put("aaa","111");
//        System.out.println(hashMap.get("aaa").hashCode());
//        Key key = new Key("aaa");
//        hashMap.put(key,1);
//        hashMap.put(key,1);
//        hashMap.put(new Key("zey3"),3);
//        System.out.println(hashMap.hashCode());

//        Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
//        m.put(new PhoneNumber(707, 867, 5309), "Jenny");
//        m.put(new PhoneNumber(707, 867, 5309), "ne");
////        System.out.println(m.get((new PhoneNumber(707, 867, 5309))));
////        System.out.println(m);
//
//        Set<String> strings = new HashSet<>();
//        strings.add("aaa");
//        strings.add("aba");
//        System.out.println(strings);
    }
}
