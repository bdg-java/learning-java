package com.bdg.MapImp;

public class MyMap<K,V>  {
    private int current;
    private int Default_Capacity = 16;


    private MyEntery<K,V> [] values = new MyEntery[Default_Capacity];

    public int size(){
        return current;
    }
    public Object put(K key, V value) {
        for (int i = 0; i < current; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);

                return key ;
            }
        }

        values[current++] = new MyEntery<>(key, value);

        return null;
    }

    public V get(K key) {
        for (int i = 0; i < current; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        MyMap<String,Integer> map = new MyMap<>();
        map.put("one",1);
        map.put("five",5);
        map.put("three",3);
        map.put("four",4);
        map.put("two",2);
    }


}
