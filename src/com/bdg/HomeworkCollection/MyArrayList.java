package com.bdg.HomeworkCollection;

public class MyArrayList<E> {
    public static final int DEF_INDEX = 10;
    private int size;
    public E[] items;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void  clear(){
        size = 0;
    }


    public void add(int index, E element){

        items[index] = element;
        size++;

    }
    public E remove(int index){
       E removeItem =  items[index] ;
        size--;
        return removeItem;

    }
    public void increaseSize(){
        size = size()*2-1;
    }
    public E get(int index){
        if(index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException();
        }

        return items[index];
    }

    public E set(int index, int newVal){
        if(index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException();
        }
        E a = items[index];
        items[index] = items[newVal];
        return a;

    }


}
