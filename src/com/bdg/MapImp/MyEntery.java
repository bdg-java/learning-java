package com.bdg.MapImp;

public class MyEntery<K,V> {
    private K key;
    private V value;

    MyEntery(K key, V value){
        this.key = key;
        this.value = value;
        final int hash;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }

}
