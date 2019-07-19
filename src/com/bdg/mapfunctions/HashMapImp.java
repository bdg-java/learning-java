package com.bdg.mapfunctions;

import java.util.Arrays;
import java.util.Collection;

import java.util.Map;
import java.util.Set;

public class HashMapImp<K, V> implements Map<K, V> {

    private static final int INITIAL_CAPACITY = 12;
    private int loadFactor;
    private int size;

    private Node<K, V>[] elementData;

    HashMapImp() {
        elementData = new Node[INITIAL_CAPACITY];
    }

    private static class Node<K, V> {
        private int hash;
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
    public V get(Object key) {

        int index = hashCodeToIndex((K) key);

        return elementData[index].value;

    }

    @Override
    public V put(K key, V value) {
        size++;
        int index = hashCodeToIndex(key);
        Node<K, V> node = new Node<>(index, key, value, null);
        if (elementData[index] == null) {
            elementData[node.hash] = node;
        } else {
            Node<K, V> current = elementData[index];
            while (elementData[index].next != null) {

                current = elementData[index];
            }
            current.next = node;

        }

        return value;

    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private int hashCodeToIndex(K key) {
        return key.hashCode() % size;
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(elementData) + '}';
    }
}
