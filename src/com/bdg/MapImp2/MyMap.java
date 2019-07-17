package com.bdg.MapImp2;

import java.util.*;

public  class MyMap implements Map {
    private ArrayList keys;
    private ArrayList values;

    public MyMap() {
        keys = new ArrayList();
        values = new ArrayList();
    }

    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        int i = keys.indexOf(key);
        if (i == -1)
            return null;
        return values.get(i);    }

    @Override
    public Object put(Object key, Object value) {
        for (int i = 0; i < keys.size(); i++) {
            Object old = keys.get(i);

            if (((Comparable) key).compareTo(keys.get(i)) == 0) {
                keys.set(i, value);
                return old;
            }


            if (((Comparable) key).compareTo(keys.get(i)) == +1) {
                int a = i > 0 ? i - 1 : 0;
                keys.add(a, key);
                values.add(a, value);
                return null;
            }
        }
        keys.add(key);
        values.add(value);
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }


    public static void main(String[] args) {

        Map map = new MyMap();

        map.put("one",1);
        map.put("five",5);
        map.put("three",3);
        map.put("four",4);
        map.put("two",2);
        System.out.println(map.get("one"));
        System.out.println(map.size());
    }
}
