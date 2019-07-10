package com.bdg.HomeworkCollection;

import java.util.NoSuchElementException;

public class MyArrayListIteractor<E> extends MyArrayList<E>  {
    public int DEFAULT_INDEX = 0;



    public boolean hasnext(){
       return DEFAULT_INDEX < size();
    }

    public E next(){
        if(!hasnext()){
            throw new NoSuchElementException();
        }
       return items[DEFAULT_INDEX++];
    }

    public void remove(){
        this.remove(--DEFAULT_INDEX);
    }
}
